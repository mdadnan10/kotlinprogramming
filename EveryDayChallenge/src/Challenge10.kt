fun main(args: Array<String>){
    var totalMiles = 2052
    var daysTaken = 6
    var stoppageEachDay = 2
    var every1mile  = 1.60934
    var totalKm = totalMiles * every1mile
    var totalStoppageInWholeDrive = daysTaken * stoppageEachDay
    var kmInEachStoppage = totalKm / totalStoppageInWholeDrive

    print("Average Km Between Every Stops: $kmInEachStoppage Km")
}