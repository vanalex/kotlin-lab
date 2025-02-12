package org.example.basics

class Person(val name: String, private var isStudent: Boolean, private var age: Int) {
    fun name(): String {
        return this.name
    }

    fun age(): Int {
        return this.age
    }

    fun isAdult(): Boolean {
        return this.age >= 18
    }

    fun isStudent(): Boolean {
        return this.isStudent
    }

    fun isEligibleToVote(): Boolean {
        return isAdult() && !isStudent()
    }

    fun canBuyAlcohol(): Boolean {
        return isAdult()
    }

    fun canBuyTobacco(): Boolean {
        return isAdult()
    }

    fun canBuyFireworks(): Boolean {
        return isAdult()
    }

    fun canDrive(): Boolean {
        return isAdult()
    }

    fun canMarry(): Boolean {
        return isAdult()
    }

    fun canVote(): Boolean {
        return isAdult()
    }
}