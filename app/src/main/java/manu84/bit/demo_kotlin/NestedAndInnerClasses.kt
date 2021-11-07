package manu84.bit.demo_kotlin

class NestedAndInnerClasses {
}

class OuterClass {
    private var name: String = "Mr. T"

    fun getName(): String {
        return name
    }

    //Nested class cannot access private members of outer class directly. Besides. Nested Class is an
    //static member of OuterClass, so the OuterC
    class NestedClass{

        var description: String = "Code inside NestedClass"
        private val id: Int = 101

        fun foo(){
            println("ID is $id")
        }

    }
    //Inner class is
    inner class InnerClass {
        var description: String = "Code inside InnerClass"
        private val id: Int = 102

        fun foo(){
            println("Name is $name")
            println("ID is $id")
        }
    }
}

fun main() {
    println(OuterClass.NestedClass().description)

    var nestedObject1 = OuterClass.NestedClass()
    nestedObject1.foo()

    println(OuterClass().getName())

    //main function is outside the OuterClass, so private members are not directly accessible.
    var obj = OuterClass()
    println(obj.getName())

    var outerObject = OuterClass().InnerClass()
    println(outerObject.description)
    println(outerObject.foo())
}