package com.rex.student

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter student's name: ")
    val name = scanner.next()
    println("Please enter student's name: ")
    val english = scanner.nextInt()
    println("Please enter student's name: ")
    val math = scanner.nextInt()
    val stu = Human(name, english, math)
    stu.print()
}

class Human(var name :String,var english :Int, var math :Int){
    fun print() {
        println (name + "\t" + english + "\t" + math +
                "\t" + (english + math) / 2)
    }
}