package com.rex

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    val age : Int = 19;
    age = 20;
    var weight = 66.5;
    var name : String
    name = "Rex";
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}