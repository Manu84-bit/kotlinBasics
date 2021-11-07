package manu84.bit.demo_kotlin

class TypeCasting {


}

fun main() {
    var obj1: Any = "Smart cast"
    var obj2: Any = 23.5
    //Explicit type casting of an incompatible type gives null:
    var str: String? = obj2 as? String
    var namesList: List<String> = listOf("Manu", "Leo", "Sergio")
    var mixedList: List<Any> = listOf("Manu", 37, "Leo", 40, "Sergio", 45, obj1, str.toString())

    for(value in mixedList){
        when(value){
            is Int -> println("$value is an Integer")
            is String -> println("$value is a String of ${value.length} characters")
            else -> println("Unknown type")
        }
    }

}