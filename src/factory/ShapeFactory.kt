package factory

import shapes.Circle
import shapes.Rectangle
import shapes.Shape
import shapes.Square

class ShapeFactory {
    fun createShape(type: String, vararg args: Double): Shape {
        return when (type) {
            "circle" -> Circle(args[0])
            "rectangle" -> Rectangle(args[0], args[1])
            "square" -> Square(args[0])
            else -> throw IllegalArgumentException("Invalid shape type")
        }
    }
}