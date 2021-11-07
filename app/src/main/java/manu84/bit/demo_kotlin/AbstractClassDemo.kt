package manu84.bit.demo_kotlin

//abstract classes cannot be instantiated; but, unlike interfaces, they have constructors.
//A child class can extend only one abstract class, but it can implement more than one interface
abstract class Mammal (private var species: String, private var numLegs: Int) {

    //must be overridden by child class
    abstract var weight: Double
    abstract fun eats(): String
    abstract fun walks():String

    fun getSpecies(): String{
        return species
    }

    fun getNumberLegs(): Int {
        return numLegs
    }
}

class Human(species: String, numLegs: Int, override var weight : Double): Mammal(species,numLegs){


    override fun eats(): String {
        return "${getSpecies()} eats everything"
    }

    override fun walks(): String {
        return "${getSpecies()} walks in ${getNumberLegs()} legs"
    }
}

fun main() {
    val h1 = Human("Homo Sapiens", 2, 60.5)

    println(h1.eats())
    println(h1.walks())
}