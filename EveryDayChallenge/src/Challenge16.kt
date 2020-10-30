fun sumOfDigits(num: Int): Int{
    var number = num
    var sum = 0

    while (number != 0){
        sum += number % 10
        number /= 10
    }
    return sum
}

fun main() {
    print("Enter a Number: ")
    var number = readLine()!!.toInt()

    var result = sumOfDigits(number)
    println("Sum Of $number is $result")
}