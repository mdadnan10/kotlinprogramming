fun main(){
    var arr = arrayOf("one", "Two", "Three")
    var arr1 = arrayOf(1,2,3) // Implicit
    var arr2 = arrayOf<Int>(10,20,30)
    var names = arrayOfNulls<String>(3)
    names = arrayOf("Md" , "Adnan", "Khan")
    arr[1] = "Hello"
    arr.set(2, "Changed")// set method

    println(arr[1])
    println(arr2.get(2)) // index call

    for (i in arr){
        println(i)
    }
    //With Index
    for ((i,e) in arr.withIndex()){
        println("$i - $e")
    }
}