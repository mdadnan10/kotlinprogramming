fun main() {
    var score = 6 // var can be re assign
    score = 4
    var shotName = "SIX"
    shotName = "Four"

    println(score)
    println("Whoop!! Its a " + shotName)

    val pie: Float = 3.14F // val is final value value which means un changeable
    print(pie)

    //Primitive Data Types
    var age: Byte = 20
    var smallNumber: Short = 3322
    var num: Int = 226633
    var biggestNumber: Long = 128839383L
    var smallFloatingPointNumber: Float = 21.33F
    var bigFloatingPointNumber: Double = 12.233333333
    var myChar: Char = '\u20B9'
    //Non-Primitive Data Type
    var myName: String = "Md Adnan Khan"

    println("\nI am " + myName + "\nI am " + age + " Years Old")
    println(smallNumber)
    println(num)
    println(biggestNumber)
    println(smallFloatingPointNumber)
    println(bigFloatingPointNumber)
    println(myChar)
}