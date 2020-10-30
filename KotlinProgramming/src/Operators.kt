fun main() {
    var num = 10
    var num1 = 3.22F
    var num2 = 3

    var result = num + num1 // addition
    var subs = num - num1 // subtraction
    var mult = num * num // Multiplication
    var div = num / num1 // Division (Consent)
    var remind = num2 % num1 // Modulus (Reminder)
    println(result)
    println(subs)
    println(mult)
    println(div)
    println(remind)

    println(num++) // post increment
    println(++num) // pre Increment

    println(num--) // Post Decrement
    println(--num) // Pre Decrement

    // Conditional Operator
    var a = 13
    var b = 20

    println(a > b) // Greater then
    println(a < b) // less then
    println(a >= b) // Greater Then Equal to
    println(a <= b) // less Then Equal to
    println(a == b) // Equal to
    println(a != b) // Not Equal to
    // in Conditional Operators the result is either true or false

    // Logical Operators
    var x = 10
    var y = 10
    if (x==y && x>=y){
        print("Need Both Condition to Satisfy")
    }
}