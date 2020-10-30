fun main() {
    print("Enter a Year: ")
    var year = readLine()!!.toInt()

    if (year % 4 == 0 || year % 400 == 0){
        if (year % 100 == 0){
            println("$year is not a Leap Year")
        }
        else{
            println("$year is a Leap Year")
        }
    }
    else{
        println("$year is not a Leap Year")
    }
}