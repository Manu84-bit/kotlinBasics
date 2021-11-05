package manu84.bit.demo_kotlin


/// nullables
var name: String? = "Manu"

fun main(){
    myFunction()
    println(addUp(3, 5))
    println(mean(6.0,7.0))
    name = null
    //To avoid an error, the ? mark is used to indicate that the length is rendered if the value is not null
    var len = name?.length
    //If name is not null, print its length
    name?.let{ println(it.length)}

    //Elvis operator variable?: valueIfNull
    println("Name is ${name?:"Amado"}")

    //Not null assertion(!!) : it says to the compiler to trust you in that a variable is not null
    //It causes nullPointer exception if the assertion is not true.

    println(name!!.lowercase())
}

fun myFunction(){
    println("Called from myFunction")
}

//Parameters and return value
fun addUp (a: Int, b: Int): Int {
    return a + b
}

fun mean(a: Double, b: Double): Double {
    return ((a+b)/2)
}


