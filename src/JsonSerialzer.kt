data class Person(val name: String, val age: Int) {
    fun greet() = "Hi, I'm $name"
}

fun greet(person: Person) = "Hi, I'm ${person.name}"

// `this` is available
fun Person.greetExt() = "Hi, I'm $name"

val lambdaPerson1: (Person) -> String = { person ->
    "Hi, I'm ${person.name}"
}

// Extension lambda
val lambdaPerson2: Person.() -> String = {
    val inta = 27
    "Hi, I'm $name"
}

sealed interface JsonValue

data class JsonNumber(private val value: Int) : JsonValue {
    override fun toString() = value.toString()
}

data class JsonString(private val value: String) : JsonValue {
    override fun toString() = "\"$value\""
}

data class JsonObject(private val attributes: Map<String, JsonValue>) : JsonValue {
    override fun toString() = attributes.toList().joinToString(",", "{", "}") { pair ->
        "\"${pair.first}\": ${pair.second}"
    }
}

class JSON {
    private val properties: MutableMap<String, JsonValue> = mutableMapOf()

    fun addNumber(name: String, value: Int) {
        properties[name] = JsonNumber(value)
    }

    infix fun String.to(value: Int) {
        properties[this] = JsonNumber(value)
    }

    fun addString(name: String, value: String) {
        properties[name] = JsonString(value)
    }

    infix fun String.to(value: String) {
        properties[this] = JsonString(value)
    }

    fun addValue(name: String, value: JsonValue) {
        properties[name] = value
    }

    infix fun String.to(value: JsonValue) {
        properties[this] = value
    }

    fun toValue(): JsonObject {
        return JsonObject(properties)
    }
}

fun json(init: (JSON) -> Unit): JsonValue {
    val json = JSON()
    init(json)
    return json.toValue()
}

fun jsonV2(init: JSON.() -> Unit): JsonValue {
    val json = JSON()
    json.init()
    return json.toValue()
}

/*
1. statement - any execution (e.g. if/else, for loop, println("Hello"))
2. expression - any execution that returns value
* */

fun main() {
    val jsonObject = JsonObject(
        mapOf(
            "user" to JsonObject(
                mapOf(
                    "name" to JsonString("Mery"),
                    "age" to JsonNumber(20)
                )
            ),
            "credentials" to JsonObject(
                mapOf(
                    "type" to JsonString("password"),
                    "value" to JsonString("123456")
                )
            )
        )
    )

    val jsonObjectV2 = json { j ->
        j.addValue("user", json { j2 ->
            j2.addString("name", "Mery")
            j2.addNumber("age", 20)
        })
        j.addValue("credentials", json { j2 ->
            j2.addString("type", "password")
            j2.addString("value", "123456")
        })
    }

    val jsonObjectV3 = jsonV2 {
        "user" to jsonV2 {
            "name" to "Mery"
            "age" to 20
        }
        "credentials" to jsonV2 {
            "type" to "password"
            "value" to "123456"
        }
    }
    println(jsonObject)
    println(jsonObjectV2)
    println(jsonObjectV3)
}
