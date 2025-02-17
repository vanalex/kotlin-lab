package org.example.basics

interface Shape {
    fun area(): Int
    fun perimeter(): Int
    fun isLargerThan(other: Shape): Boolean
}

class Rectangle(val height: Int, val width: Int): Shape {
    fun isSquare(): Boolean {
        return height == width
    }

    override fun area(): Int {
        return height * width
    }

    override fun perimeter(): Int {
        return 2 * (height + width)
    }

    override fun isLargerThan(other: Shape): Boolean {
        return this.area() > other.area()
    }
}

fun createUnitSquare(): Shape {
    return Rectangle(height = 1, width = 1)
}