fun converter(centimeter: Double){
    var cm = centimeter

    var inch = cm/2.54
    var meter = cm/100.00
    var km = cm * 0.000001

    println("{$cm}Cm is {$inch}Inch")
    println("{$cm}Cm is {$meter}Meter")
    println("{$cm}Cm is {$km}Km")
}

fun main() {
    print("Enter length in Cm: ")
    var cm = readLine()!!.toDouble()

    converter(cm)
}