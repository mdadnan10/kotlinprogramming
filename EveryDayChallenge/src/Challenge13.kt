fun main(){
    var karaLemonade = 5
    var raniLemonade = 7
    var karaSold = 0
    var raniSold = 0

    while (true) {
        print("Enter Number of Sold Lemonade Glasses By Kara: ")
        karaSold = readLine()!!.toInt()
        if (karaSold > 0){
            break
        }
        println("Enter a +ve Value")
    }

    while (true) {
        print("Enter Number Of sold Lemonade Glasses By Rani: ")
        raniSold = readLine()!!.toInt()
        if (raniSold > 0){
            break
        }
        println("Enter a +ve Value")
    }

    var karaIncome = karaLemonade * karaSold
    var raniIncome = raniLemonade * raniSold

    if (karaIncome > raniIncome){
        var income = karaIncome - raniIncome
        println("Kara Makes more Profit by " + income + "rs")
    }
    else if (raniIncome > karaIncome){
        var income = raniIncome - karaIncome
        println("Rani Makes more Profit by " + income + "rs")
    }
    else if (raniIncome == karaIncome){
        println("Both Profit is same")
    }
    else{
        println("Invalid input")
    }
}