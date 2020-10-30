import kotlin.math.pow

/*
fun main(){
//    var result = add(20,30)
//    println(result)

//    var result1 = add(10,20)
//    println(result1)

//    var checkNumber = evenOdd(265)

    printMessage(3) // Value is Argument here
    printMessage()
}

fun printMessage(count: Int = 2){ // Default Arguments, count is Parameter Here
    for (i in 1..count){
        println("Hello $i")
    }
}

fun add(num1: Int, num2: Int) = num1 + num2

fun evenOdd(num1: Int){
    if (num1 % 2 == 0){
        println("$num1 is Even")
    }
    else{
        println("$num1 is Odd")
    }
}
 */

// Functions OverLoading
/*fun addition(a: Int, b: Int, c: Int, d: Int, e: Int): Int{
    return a + b + c + d + e
}
fun addition(a: Double, b: Double): Double {
    return a + b
}
fun main(){
    println(addition(a = 2, d = 5, b = 10, c = 15, e = 9))// Named Arguments
    println(addition(10.22,4.2321))
}
 */

// Store Functions in variables
fun addition(a: Double, b: Double): Double{
    return a+b
}
fun power(a: Double, b: Double): Double {
    return a.pow(b)
}
fun main(){
    var fn = ::addition
    println(fn(11.11, 8.89))

    fn = ::power
    println(fn(10.0,2.0))
}
