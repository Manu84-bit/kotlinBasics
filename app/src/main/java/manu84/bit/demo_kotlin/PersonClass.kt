package manu84.bit.demo_kotlin

class PersonClass constructor(name: String, age: Int){

    //Code that runs once an instance is created:
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


fun main(){
    val person1: PersonClass = PersonClass("Manu", 37)
//    val person1 = PersonClass("Manu", 37)
    val person2 = PersonDefault()
    val person3 = PersonDefault(firstName = "Alex")

    val phone1: AndroidPhone = AndroidPhone("Samsung", "Galaxy S20 Ultra")
    val phone3: AndroidPhone = AndroidPhone("Nokia", "xr20")

}