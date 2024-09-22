package shapes

open class Shape {
    open fun calculateArea(): Double {
        throw NotImplementedError()
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun calculateArea(): Double {
        return width * height

    }
}

class Square(private val side: Double) : Shape() {
    override fun calculateArea(): Double {
        return side * side
    }
}