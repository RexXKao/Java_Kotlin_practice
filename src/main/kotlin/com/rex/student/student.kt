package com.rex.student

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Human("rex", 66, 88)
    stu.print()
    println("High score: ${stu.highest()}")
}

class Human(var name :String?,var english :Int, var math :Int){
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
//        print (name + "\t" + english + "\t" + math +
//                "\t" + getAverage() + "\t" +
//                )
//        println("\t" + grading())
    }

    fun grading() = when(getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun passOrFailed() = if(getAverage() >= 60) "PASS" else "FAILED"

/*
    fun grading() :Char{
        var grading = when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
        return grading
    }
*/

    fun getAverage() = (english + math) / 2

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun nameCheck() = name?.length
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
//    println("Please enter student's name: ")
    val name = null
    println("Please enter student's english: ")
    val english = scanner.nextInt()
    println("Please enter student's math: ")
    val math = scanner.nextInt()
    val stu = Human(name, english, math)
    stu.print()
    stu.nameCheck()
}
