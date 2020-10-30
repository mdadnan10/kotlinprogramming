fun students(count: Int){

    var mark = IntArray(count)
    var avgMarks = 0


        for (i in 0 until count) {
            if (i == 0){
                print("Enter " + (i+1) +"st Student Marks: ")
            }
            if (i == 1) {
                print("Enter " + (i+i) +"nd Student Marks: ")
            }
            if (i == 2){
                print("Enter " + (i+1) +"rd Student Marks: ")
            }
            if (i in 3..20){
                print("Enter " + (i+1) +"th Student Marks: ")
            }
            mark[i] = readLine()!!.toInt()
        }

    for (j in 0 until count){
        avgMarks += mark[j]
    }

    avgMarks /= count

    print("The Average Marks of $count Students is $avgMarks")
}

fun caseChecker(name: String){
    var myName = name.toUpperCase()

    if (myName == "ADNAN"){
        print("I am Converted your Name into Upper Case: $myName 😁😁😁")
    }

    val cakes = listOf("Chocolate", "Cream", "Flavour")

    for (things in cakes){
        println(things)
    }
}

fun passwordValidation(password: String){
    if (password.length > 5){
        print("Password is accepted")
    }

}
