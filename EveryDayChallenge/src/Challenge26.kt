fun main() {
    print("Enter Temperature(in celsius): ")
    var n = readLine()!!.toDouble()

    var fahrenheit = (n * 9/5) + 32
    var c = '\u00B0'

    println("$n$c C is $fahrenheit$c F")
}