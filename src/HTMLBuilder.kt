class HtmlElement(val tag: String) {
    private val attributes = mutableMapOf<String, String>()
    private val children = mutableListOf<HtmlElement>()
    private var textContent: String? = null

    // Method to set attributes
    fun attr(name: String, value: String) {
        attributes[name] = value
    }

    // Method to set text content
    fun text(content: String) {
        textContent = content
    }

    // Method to add child elements
    fun child(tag: String, init: HtmlElement.() -> Unit = {}) {
        val childElement = HtmlElement(tag)
        childElement.init() // Apply the DSL block to the child element
        children.add(childElement)
    }

    // String representation of the HTML element
    override fun toString(): String {
        val attrString = if (attributes.isNotEmpty()) {
            attributes.entries.joinToString(" ") { "${it.key}=\"${it.value}\"" }.let { " $it" }
        } else {
            ""
        }

        val childrenString = if (children.isNotEmpty()) {
            "\n${children.joinToString("\n") { it.toString() }}\n"
        } else {
            ""
        }

        val textString = textContent ?: ""

        return "  <$tag$attrString>$textString$childrenString  </$tag>"
    }
}

// Function to initialize the HTML document
fun html(init: HtmlElement.() -> Unit): String {
    val root = HtmlElement("html")
    root.init() // Apply the DSL block to the root element
    return root.toString()
}

// Example usage
fun main() {
    val htmlString = html {
        child("head") {
            child("title") {
                text("Hello, World!")
            }
        }
        child("body") {
            child("h1") {
                text("Welcome to the HTML Builder!")
            }
            child("p") {
                text("This is a simple HTML builder in Kotlin.")
                attr("class", "intro")
            }
            child("a") {
                text("Click here")
                attr("href", "https://example.com")
            }
        }
    }

    println(htmlString.trimIndent())
}
