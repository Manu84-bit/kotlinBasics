package manu84.bit.demo_kotlin

import java.util.ArrayList

fun main() {
    //Arrays
//    val numbers: IntArray = intArrayOf(1,2,3,4,5)
//    val numbers = intArrayOf(1,2,3,4,5)
    val numbers = arrayOf(1,2,3,4,5)
    //to print an array it is possible to use contentToString() function
    print(numbers.contentToString())
    println()
    //or use a for in loop

    for (n in numbers){
        print(n + 2)
    }

    val f1 = Fruit("Papaya", 10.2)
    val f2 = Fruit("Apple", 4.3)
    val fruits = arrayOf(f1,f2)
    println(fruits.contentToString())
    for(index in fruits.indices){
        println(fruits[index].name)
    }


    val mixArray = arrayOf(fruits, numbers)
    for(e in mixArray)
    println(e.contentToString())

    //Lists,
    // like arrays, are immutable, no element can be added after assignment
    val months = listOf("March", "April", "June")
    var mix = listOf("March", 30, 1984, 66.2, true)

    //to conver to an inmutable list:

    var mutableList1 = months.toMutableList()
    val additionalMonths = listOf("July", "August", "November")
//    for (m in additionalMonths){
//        mutableList1.add(m)
//    } To do this easily, use addAll():
    mutableList1.addAll(additionalMonths)

    for(e in mutableList1){
        println(e)
    }

    var days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days.add("Fri")
    days.removeAt(3)
    //for arrays or list of explicit String type it is not necessary to use contentToString()
    println(days)


    //Sets
    //Duplicated data is not allowed
    val vegetables = setOf("Onion", "Spinach", "Garlic", "Onion")
    println(vegetables.size)
    println(vegetables.toSortedSet())
    val mutableVegetables = vegetables.toMutableSet()
    mutableVegetables.add("Lettuce")
    println(mutableVegetables)


    //Maps
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2])

    val daysMutable = daysOfTheWeek.toMutableMap()
    daysMutable.toSortedMap()
    println(daysMutable)

    val fruitsMap = mapOf("Good" to f1, "Love" to f2)
    println(fruitsMap)

    //ArrayList
    val arrayList = ArrayList<String>()
    arrayList.add("Manu")
    arrayList.add("Pili")
    arrayList.add("Nat")
    println(arrayList)

    val itr = arrayList.iterator()

    while(itr.hasNext()){
        println(itr.next())
    }

    println(arrayList.get(0))

    //TODO write a program that adds five Numbers (Double) to an arrayList and
// then calculates the average of those numbers. Please use a for (in) loop

    val arrayListD = ArrayList<Double>()
    val arrayD = arrayOf(1.2, 5.0, 4.3, 4.2, 5.4)

    arrayListD.addAll(arrayD)
    var sum: Double = 0.0
    for (i in arrayListD){
        sum +=i

    }
    var avg: Double = sum/arrayListD.size

    println(avg)

    //Lambda expressions
    var addFun: (Int, Int)->Int = {a: Int, b: Int-> a + b}

    var addFun2 = {a: Int, b:Int -> println(a + b)}

    addFun2(3,4)
}


data class Fruit (var name: String, var price: Double)