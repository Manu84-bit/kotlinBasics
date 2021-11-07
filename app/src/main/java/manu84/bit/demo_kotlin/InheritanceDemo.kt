package manu84.bit.demo_kotlin


interface AgeFinder {
    var age: Int
    var country :String
    fun printAge(){

    }
    fun printCountry() {
        println(" is from $country")
    }
}


//to make a class inheritable in kotlin, the open access modifier has to be used
//Parent extends from AgeFinder
open class Parent(var name: String, override var age: Int, override var country: String = "Colombia"): AgeFinder{
    var lastName: String = "Amado"

    //implementing the interface method
    override fun printAge() {
        println("$name is $age years old.")
    }
    open fun extendName(n: String){
        lastName+= " $n"
    }

   open fun printName(){
        println("$name $lastName")
    }
    override fun printCountry(){
        print("$name")
        super.printCountry()
    }

}
//Child extends Parent  Child:Parent()
open class Child(name: String, age: Int, weight: Double): Parent(name,age) {
    //override as a form of Polymorphism
   override fun extendName(n: String) {
       lastName+= " von $n"
   }
    //overcharge
    fun printName(title:String, parent: Parent){
        println("${this.name} is ${parent.name}'s $title")
    }

}

fun main() {
    val p1 = Parent("Manu", 37)
    val c1 = Child("Alejo", 17, 60.0)

    p1.printName()
    p1.extendName("González")
    p1.printName()
    c1.printName()
    c1.extendName("Granada")
    c1.printName()
    c1.printName("son", p1)
    p1.printAge()
    p1.printCountry()
    c1.printAge()
    c1.printCountry()


}