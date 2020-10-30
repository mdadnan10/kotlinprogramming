fun password(password: String){
    var check = password
    if (check.length >= 8 && check.hashCode() in 0..9){
        print("$check Password is Accepted")
    }
    else{
        println("Password Must have 8 characters and have numeric numbers")
    }
}

fun main() {
    print("Enter Your Password: ")
    var myPassword = readLine()!!

    password(myPassword)
}