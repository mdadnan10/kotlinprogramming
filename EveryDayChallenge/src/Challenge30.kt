fun result(n1: Int, n2: Int){
    var sum = n1 + n2
    println("Sum of $n1 & $n2 is: $sum")

    var diffrence = n1 - n2
    println("Difference of $n1 % $n2 is: $diffrence")

    var product = n1 * n2
    println("Product of $n1 & $n2 is: $product")

    var average = sum / 2
    println("Average of $n1 & $n2 is: $average")

    var maximum = Math.max(n1, n2)
    println("Maximum of $n1 & $n2 is: $maximum")

    var minimum = Math.min(n1, n2)
    println("Minimum of $n1 & $n2 is: $minimum")

}

fun main(args: Array<String>) {
    println("Enter Two Numbers: ")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    result(num1, num2)
}