package post

import java.util.*

fun main(args: Array<String>) {
    var scanner: Scanner = Scanner(System.`in`)
    print("Please enter object's length: ")
    var length: Float = scanner.nextFloat()
    print("Please enter object's width: ")
    var width: Float = scanner.nextFloat()
    print("Please enter object's height: ")
    var height: Int = scanner.nextInt()

    var box3: Box = Box3()
    var box5: Box = Box5()

    if (box3.validate(length, width, height)) {
        println("Box3")
    } else if (box5.validate(length, width, height)) {
        println("Box5")
    } else
        println("OtherBox")
}