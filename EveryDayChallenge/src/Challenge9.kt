fun main(){
    var sweaterPrice = 68
    var sweaterCount = 3
    var computerGamePrice = 75
    var computerGameCount = 1
    var braceletPrice = 43
    var braceletCount = 2

    //Discount and rebate
    var returnedBraceletCount = 1
    var rebateOnComputerGame = 10

    var totalGiftPrice = (sweaterPrice * sweaterCount) + (computerGamePrice * computerGameCount) + (braceletPrice * braceletCount)

    var discountAndRebate = (braceletPrice * returnedBraceletCount) + rebateOnComputerGame

    var finalGiftPrice = totalGiftPrice - discountAndRebate

    print("Final Gift Price is $$finalGiftPrice")
}