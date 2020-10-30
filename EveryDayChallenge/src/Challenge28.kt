fun main() {
    val hour = 60
    val day = 24
    val year = 365
    val daveAgeIMin = 1_37_72_160
//    val daveAgeInHour =  daveAgeIMin / hour
//    val daveAgeInDay = daveAgeInHour / day
//    val daveAgeInYear = daveAgeInDay / year

    val minutesInYear = hour * day * year
    val daveAgeInYear = daveAgeIMin/minutesInYear

    println("Dave is $daveAgeInYear Years Old")
}