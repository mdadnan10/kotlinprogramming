import java.util.Scanner

/*
fun main(args: Array<String>){
    var count = 5
    while (count >= 1){
        println("Hello")
        count--
    }
}
 */

/*
fun main() {
    var read = Scanner(System.`in`)
    print("Enter a Number: ")
    var number = read.nextInt();
    var count = 1
    while (count <= 10){
        var table = number * count;
        println("$number * $count = $table");
        count++
    }
}
 */

/*
fun main(){
    var i = 13344;
    do {
        println("Run At Least once")
        i++
    }
    while (i <= -19)

    var index = 5
    do {
        println("Hello")
        index++
    }while (index > 5 && index < 10)
}
 */

fun main(){
    //increment
//    for (i in 1..5){
//        println(i)
//    }
//    for (i in 1..5 step 2){
//        println(i)
//    }
//    for (i in 1 until 5){
//        println(i)
//    }

    //Decrement
    for (i in 10 downTo 1){
        println(i)
    }
    for (i in 10 downTo 0 step 2){
        println(i)
    }
}