fun main(args: Array<String>){
    print("Enter a number to get Multiplication Table: ")
    val number = readLine()!!.toInt()

    for (i in 1..10){
        val table = number * i;
        println("$number * $i = $table")
    }
}