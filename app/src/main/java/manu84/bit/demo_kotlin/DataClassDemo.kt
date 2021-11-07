package manu84.bit.demo_kotlin

data class DataClassDemo (var name: String, var age: Int) {


}

fun main() {

    //In data classes, the toString(), equals(), hashCode(), copy() and componentN() functions
    //are added automatically

    val present1 = DataClassDemo("Manu", 37)
    val future1 = DataClassDemo("Manu", 38)
    println(present1)
    println(present1==future1)
    val older1 = future1.copy(age=40)
    println(future1)
    println(older1)

    println(present1.component1())

    //data classes allow deconstructing

    val (nombre, edad) = present1
    println("$nombre $edad")

    val phone1 = MobilePhone("Android", "Nokia", "Xr20")
    phone1.chargeBattery(20)

}


class MobilePhone(var osName: String, var brand: String, var model: String, var battery: Int = 30){
    init {

        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(charge: Int){
        println("Prior charge level is $battery")
        battery += charge
        println("Actual charge level is $battery")
    }
}