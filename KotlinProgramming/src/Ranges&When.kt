/*
fun main(args: Array<String>){
    val number = 5
    val result = number in 1..5 // checks 1 to 5
    val result1 = number in 1 until 5 // it checks till n-1(5-1)

    println(result1)
}
*/

fun main(){
    val animal = "dog"

    /*
    if (animal == "horse"){
        print("Animal is Horse")
    }
    else if (animal == "cat"){
        print("Animal is Cat")
    }
    else if (animal == "dog"){
        print("Animal is Dog")
    }
    else{
        print("Animal not match ")
    }
    */

    when(animal){
        "horse" -> println("Animal is Horse")
        "dog" -> println("Animal is Dog")
        "cat" -> println("Animal is Cat")
        "tiger" -> println("Animal is Tiger")
        "rabbit" -> println("Animal is rabbit")
        else -> print("Animal not Found")
    }

    // Customized code
    var result = when(animal){
        "horse" -> ("Animal is Horse")
        "dog" -> ("Animal is Dog")
        "cat" -> ("Animal is Cat")
        "tiger" -> ("Animal is Tiger")
        "rabbit" -> ("Animal is rabbit")
        else -> ("Animal not Found")
    }
    println(result)

    var number = 17;
     var myResult = when(number){
         12 -> ("Number is Twelve")
         13 -> ("Number is Thirteen")
         14 -> ("Number is Fourteen")
         17 -> ("Number is Seventeen")
         in 19..100 -> ("Mine")

         else -> ("Number is not Found")
     }
    println(myResult)
}