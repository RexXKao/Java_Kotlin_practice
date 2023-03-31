package com.rex

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human(66.5f, 1.7f)
    println(h.bmi())
    println(h.weight)

    val score = 88
    println(score > 60)
    val c :Char = 'A'
    println(c.toInt() > 60)
    /*val age = 19;
    age = 20;
    var weight = 66.5;
    var name : String
    name = "Rex";*/
}

class Human(var weight: Float, var height: Float, var name: String = "") {
//    var name: String = ""
    init {
        println("test $weight")
    }

    /*constructor(name:String, weight: Float, height: Float) :this(weight, height) {
        this.name = name
    }*/

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello() {
        println("Hello kotlin")
    }
}