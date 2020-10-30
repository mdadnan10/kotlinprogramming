import kotlin.math.pow

fun main() {
    print("Enter A number: ")
    var number = readLine()!!.toDouble()

    var square = Math.pow(number, 2.0)

    println("Square of $number is $square")

}