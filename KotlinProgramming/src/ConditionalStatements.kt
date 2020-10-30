fun main(){
//    val isRaining = false
//
//    if (isRaining){
//        println("Take Umbrella")
//    }
//    else {
//        println("It's a Beautiful day Enjoy It..")
//    }

    val x = 11
    val y = 10

    /*
    if (x > y){

        println("X is Greater Then Y")
    }
    else if (x == y){
        println("X is Equal to Y")
    }
    else {
        println("Y is Greater Then X")
    }
     */

    // Kotlin Style
    val result = if (x > y){
        ("X is Greater Then Y")
    }
    else if (x == y){
        ("X is Equal to Y")
    }
    else {
        ("Y is Greater Then X")
    }

//    println(result)

    val num = 11
    val oddEven = if (num % 2 == 0) ("Given Number is Even")
    else ("Given Number is Odd")
    println(oddEven)
}