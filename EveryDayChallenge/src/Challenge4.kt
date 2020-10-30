/*
fun main(args: Array<String>){
    var totalHotDogs = 400
    var perPacket = 8
    var numberOfPackets = 400 / 8
    println("Total No oF packages bought by Jack is $numberOfPackets")
}
 */

//Another Method
fun main(){
    var totalHotDogs = 400
    var hotDogPerPack = 8
    var totalContainer = 0
    var temp = totalHotDogs+hotDogPerPack

    while (temp > hotDogPerPack){
        temp -= hotDogPerPack
        totalContainer++
    }
    println("Jack Buy $totalContainer Containers")
}