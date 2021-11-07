package manu84.bit.demo_kotlin

import java.lang.IllegalArgumentException

class PersonClass constructor(name: String, age: Int){

    //Code that runs each time an instance is created:
    init {
        println("A new person has been created: $name is $age years old.")
    }

}

class PersonDefault constructor(firstName: String = "John", lastName: String = "Doe" ) {
    init {
        println("Person with values: $firstName $lastName")
    }
}

class AndroidPhone constructor(brand: String, model: String, osName: String = "Android") {
    init {
        println("The phone is a $brand $model that runs $osName")
    }
}

//Class with constructor and member variables
class Vehicle(type: String, weight: Double){
    //variables

    var weight = weight
        set(value){
            field = if(value > 0) value else throw IllegalArgumentException("That's not a terrestrial weight")
        }

    var wheels: Int? = null
    var type = type
        //getters and setters by default:
//        get() {
//            return field
//        }
//         set(value){
//             field = value
//         }

        //Custom getters and setters:
        get() {
            return field.uppercase()
        }

        set(value){
            field = "super $value"
        }


    var hasMotor: Boolean = false

    //class methods
    fun stateWeight(){
        println( "$type has $weight kg and the number of wheels is... ${wheels?:"No idea"}")
    }

    //secondary constructor

    constructor(type: String, weight: Double, wheels: Int): this(type, weight){
        this.wheels = wheels
    }

}


fun main(){
    val person1: PersonClass = PersonClass("Manu", 37)
//    val person1 = PersonClass("Manu", 37)
    val person2 = PersonDefault()
    val person3 = PersonDefault(firstName = "Alex")

    val phone1: AndroidPhone = AndroidPhone("Samsung", "Galaxy S20 Ultra")
    val phone3: AndroidPhone = AndroidPhone("Nokia", "xr20")

    val v1: Vehicle = Vehicle("Bike", 30.2)
    v1.stateWeight()
    v1.type = "Motorbike"
    v1.stateWeight()
    val v2: Vehicle = Vehicle("Bike", 27.3, 2)
    v2.stateWeight()
}