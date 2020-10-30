/*
fun main(){
    var busCarries = 1_200_000
    var noOfDaysInAYear = 365
     var totalNoOfPeopleInAYear = noOfDaysInAYear * busCarries

    print("Total No Of people Bus Carried in a year is $totalNoOfPeopleInAYear")
}
 */

fun multiply(x:Int, y: Int): Int{
    // 0 multiplied with anything is 0
    if (y==0){
        return 0
    }
    // Add x one by one
    if (y > 0){
        return (x + multiply(x, y-1))
    }
    // The Case Where y is negative
    if (y < 0 ){
        return-multiply(x, -y)
    }

    return -1
}

fun main(args: Array<String>){
    var peopleTravelledDaily = 1_200_000
    var daysOfYear = 365
    var peopleTravelledYearly = multiply(peopleTravelledDaily,daysOfYear)
    
    println(peopleTravelledYearly)
}