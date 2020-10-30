fun main(args: Array<String>){
    print("Enter Distance(in Meters): ")
    val distance = readLine()!!.toFloat()

    print("Enter Time(Hour): ")
    val hour = readLine()!!.toFloat()
    print("Enter Time(Minutes): ")
    val min = readLine()!!.toFloat()
    print("Enter Time(Seconds): ")
    val sec = readLine()!!.toFloat()

    val timeSeconds = (hour * 60) + (min * 60) + sec
    val kph = (distance/1000.0F) / (timeSeconds / 3600.0F)

    val mph = kph / 1.609F

    println("Your Speed In Miles/Hour is $mph")

}