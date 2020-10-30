import java.util.Scanner;

/*
fun main() {

    var x = 10
    var y = 20

    var result = ((x+y) * (y-x)) / x
    println(result)

    val above70 = false
    val knowsProgramming = true

    //&& AND
    var calledForInterview = above70 && knowsProgramming // both Condition Needs to satisfy for true
    println(calledForInterview)

    //|| OR
    calledForInterview = above70 || knowsProgramming // only one condition needs to satisfy for true
    println(calledForInterview)

    // ! NOT
    calledForInterview = !above70 && knowsProgramming // reverse the result from true to false and vice-versa
    println(calledForInterview)
}
 */



   /*
    fun main(){

        var age = 44;
        var movieName = "Titanic"

        if (age <= 10){
            println("You are not Allowed to Watch " + movieName + " Movie")
        }
        else if (age > 10 && age < 18){
            println("You are allowed to Watch " + movieName + " Movie")
        }
        else{
            println(movieName +" Movie is So Entertaining")
        }
    }
    */

/*
fun main(args: Array<String>){
    var num: Int = 29
    var name: String = "Md Adnan Khan"

    if (name.length % 2 != 0){
        println("You are lucky")
    }
    else{
        println("Close to Your Luck")
    }

    if (num % 5 == 0) {
        if (num % 2 == 0) {
            println("FizzBuzz")
        }
        else {
            println("Buzz")
        }
    }
        else if (num % 2 == 0){
            println("Fizz")
        }
    else{
        print("Not Found")
    }
}
 */

/*
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
*/

/*
    fun main(args: Array<String>){
        var operator: Char
        var sc = Scanner(System.`in`)

        print("Enter First Number: ")
        var num = sc.nextFloat()

        print("Enter Second Number: ")
        var num1 = sc.nextFloat()

        while (true) {
            println("Enter A operator(+, -, *, /, %:")
            operator = sc.next()[0]
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                break
            }
            else {
                println("Enter a Valid Operator")
            }
        }

        var result: Float = 0F
        when(operator){
            '+' -> result = num + num1
            '-' -> result = num - num1
            '*' -> result = num * num1
            '/' -> result = num / num1
            '%' -> result = (num/100)*num1
        }
        print("$num $operator $num1 = $result")
    }
 */


/*
fun main(args: Array<String>){
    val percent = 100;
    val fullMark = 600
    var math: Int
    var physics: Int
    var chemistry: Int
    var biology: Int
    var english: Int
    var hindi: Int

    var reader = Scanner(System.`in`);

    while (true) {
        print("Enter Math Mark: ")
        math = reader.nextInt();
        if (math>=0 && math <= 100){
            break;
        }
        println("Enter Mark Between 0 to 100")
    }

    while (true){
    print("Enter Physics Mark: ")
    physics = reader.nextInt();
        if (physics >= 0 && physics <= 100){
            break;
        }
        println("Enter Mark Between 0 to 100")
    }

    while (true){
    print("Enter Chemistry Mark: ")
    chemistry = reader.nextInt();
        if (chemistry >= 0 && chemistry <= 100){
            break;
        }
        println("Enter Mark Between 0 to 100")
    }

    while (true){
    print("Enter Biology Mark: ")
    biology = reader.nextInt();
        if (biology >= 0 && biology <= 100){
            break;
        }
        println("Enter Mark Between 0 to 100")
    }

    while (true){
    print("Enter English Mark: ")
    english = reader.nextInt();
        if (english >= 0 && english <= 100){
            break;
        }
        println("Enter Mark Between 0 to 100")
    }

    while (true){
    print("Enter Hindi Mark: ")
    hindi = reader.nextInt();
        if (hindi >= 0 && hindi <= 100){
            break;
        }
        println("Enter Mark Between 0 to 100")
    }

    var symbol = '%';
    var emoji = "🎉"

    var securedMark = math + physics + chemistry + biology + english + hindi;
    var securedPercentage = (securedMark * percent)/fullMark;

    if (math < 30 || physics < 30 || chemistry < 30 || biology < 30 || english < 30 || hindi < 30 || securedPercentage < 33){
        println("Your Secured Mark: " + securedMark + " out of $fullMark")
        println("Your Secured Percentage: " + securedPercentage + symbol)
        println("Sorry!! Your Grade: F")
    }
    else if (securedPercentage >= 33 && securedPercentage < 40){
        println("Your Secured Mark: " + securedMark + " out of $fullMark")
        println("Your Secured Percentage: " + securedPercentage + symbol)
        print("Congratulation$emoji\nYour Grade: E")
    }
    else if (securedPercentage >= 40 && securedPercentage < 50){
        println("Your Secured Mark: " + securedMark + " out of $fullMark")
        println("Your Secured Percentage: " + securedPercentage + symbol)
        print("Congratulation$emoji\nYour Grade: D")
    }
    else if (securedPercentage >= 50 && securedPercentage < 60){
        println("Your Secured Mark: " + securedMark + " out of $fullMark")
        println("Your Secured Percentage: " + securedPercentage + symbol)
        print("Congratulation$emoji\nYour Grade: C")
    }
    else if (securedPercentage >= 60 && securedPercentage < 70){
        println("Your Secured Mark: " + securedMark + " out of $fullMark")
        println("Your Secured Percentage: " + securedPercentage + symbol)
        print("Congratulation$emoji\nYour Grade: B")
    }
    else if (securedPercentage >= 70 && securedPercentage < 80){
        println("Your Secured Mark: " + securedMark + " out of $fullMark")
        println("Your Secured Percentage: " + securedPercentage + symbol)
        print("Congratulation$emoji\nYour Grade: B+")
    }
    else if (securedPercentage >= 80 && securedPercentage < 90){
        println("Your Secured Mark: " + securedMark + " out of $fullMark")
        println("Your Secured Percentage: " + securedPercentage + symbol)
        print("Congratulation$emoji\nYour Grade: A")
    }
    else if (securedPercentage >= 90 && securedPercentage <= 100){
        println("Your Secured Mark: " + securedMark + " out of $fullMark")
        println("Your Secured Percentage: " + securedPercentage + symbol)
        print("Congratulation$emoji\nYour Grade: A+")
    }

        if (math < 30){
            println("Sorry!! $math")
        }
        if (physics < 30){
            println("Sorry!! $physics")
        }
        if (chemistry < 30){
            println("Sorry!! $chemistry")
        }
        if (biology < 30){
            println("Sorry!! $biology")
        }
        if (english < 30){
            println("Sorry!! $english")
        }
        if (hindi < 30){
            println("Sorry!! $hindi")
        }

}
 */

// 90+ A+
// 80-90 A
// 70-80 B+
// 60-70 B
// 50-60 C
// 40-50 D
// 33-40 E
// 0-32 F

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
    var input = Scanner(System.`in`);
    print("Enter a number: ")
    var table = input.nextInt();

    for (i in 1..10){
        var result = table * i;
        //String Templating
        println("$table x $i = $result")
    }
}
 */

/*
fun main(){
    var input = Scanner(System.`in`);
    print("Enter a number: ")
    var table = input.nextInt();

    for (i in 1..3){
        for (j in 1..10) {
            var result = table * j;
            println("$table x $j = $result")
        }
    }
}
 */

/*
fun main(){
    var input = Scanner(System.`in`);
    print("Enter a number: ")
    var num = input.nextInt();

    for (i in 1..num){
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}
 */

/*
fun main(args: Array<String>){
    print("Enter Principal: ")
    var principal = readLine()!!.toFloat()

    print("Enter Rate: ")
    var rate = readLine()!!.toFloat()

    print("Enter Duration(In years): ")
    var time = readLine()!!.toFloat()

    var interest = principal * rate * time / 100

    print("Your Simple Interest is: $interest")
}
 */

/*
fun interest(principal: Int, rate: Float, time: Int): Float{
    var simpleInterest = principal * rate * time /100
    return simpleInterest
}

fun main(){
    print("Enter Principal: ")
    var p = readLine()!!.toInt()

    print("Enter Rate: ")
    var r = readLine()!!.toFloat()

    print("Enter Time: ")
    var t = readLine()!!.toInt()

    var i = interest(p,r,t)

    print("Your Simple Interest is : $i")
}
 */

/*
fun main(args: Array<String>){
    print("Enter no of Students: ")
    var noOfStudents = readLine()!!.toInt()

    students(noOfStudents)
}
 */

fun main(){
    print("Enter Your Name: ")
    var name = readLine()!!

    caseChecker(name)
}
