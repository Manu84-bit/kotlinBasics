package manu84.bit.demo_kotlin

fun main(){
    val firstName = "Manu"
    var lastName: String = "Amado"

    //Integer types: Byte, Short, Int, Long
    var age = 37
    //Underscores make a number more readable
    var longValue: Long = 39_456_678_87



    //Floating types: Float, Double

    var weight = 62.7

    //Boolean

    var isSunny: Boolean = false
    var isCold = true

    if (isCold && !isSunny){
        print("Es invierno\n")
    }

    //Char
    var sex = 'M'

    //Strings as arrays

    var initials = firstName[0] + "." + lastName[0]
    var finalChar = lastName[lastName.length - 1]

    println(initials)

    //Comparison operators are just like java's

    var num1 = 5
    var num2 = 6
    var num3 = null
    if(num2 < 10){
        print("Too short\n")
    }

    //Elvis operator
    println(num3?:num2)

    println("Hello, $lastName $firstName. You are $age years old. Your weight is $weight kg.")

    //Prints num1, then adds 1 after the line of code is executed.
    println("${num1++}")
    //Adds 1 to num2, then executes the line(i.e. prints the number.
    println("${++num2}")

    val soltero = "soltero"
    val casado = "casado"
    val actualState = "solero"
    val result1 = "Estás cagado"
    val idealState = "Eres soltero"
    val result2 = "Bendecido"

    // An if-else with return values can be the value of a variable as in js:
    var resultState = if(casado == actualState) {
        println(actualState)
        result1
    } else {
        println(idealState)
        result2
    }

    println(resultState)
    //When operator
    var season = 3
    when(season){
        1-> print("Winter")
        2 -> print("Summer")
        3 ->{
            println("Fall")
            println("The best season!")
        }
        4-> print("Spring")
        else -> print("Invalid season")
    }

    var month = 4
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("winter")
        else ->println("Invalid month")
    }

    var legalAge = 41
    when(legalAge){
        16,17 -> println("You can drive")
        in 18..20 -> println("You can vote")
        in 21..30 -> println("You can drink")
        in 30..40 -> println("You are getting old")
        //any value outside the interval:
        !in 16..40 -> println("You are too young or too old to do anything")
    }
    var result: Any = 0
    //When statement can be use as an expression if assigned to a variable
    var x: Any = 3.5f
    result = when(x){
        is Float -> "$x is a Float"
        is Integer -> "$x is an Integer"
        is Double -> "$x is a Double"
        is String -> "$x is a String"
        else -> "$x is of a different type"
    }

    print(result)


    //while
    var counter = 100

    while (counter>=0) {
        print("$counter ")
        counter -= 2
    }

    // for loops
    for (num in 1..10){
        print ("$num")
    }

    for (num in 1 until 8){
        print("\n$num")
    }
    for (num in 10 downTo 2 step 2){
        println("$num")
    }

    for (num in 0 until 11){
        when(num){
           in 0..9 -> print("$num")
            10 -> println("It's over 9")
        }
    }

    //TODO: Write a while loop that checks the humidity (not the humidityLevel).
// The variable humidityLevel starts at 80. The variable humidity is initialized with "humid".
// If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
    //Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"

    var humidityLevel = 80
    var humidity = "humid"
    while(humidity == "humid"){
        humidityLevel -= 5
        println("Humity is now $humidityLevel")
        if(humidityLevel <= 60) {
            println("It's comfy now")
            humidity = "comfy"
        }

    }

    //Break and continue

    for (i in 1 until 20){
        print("$i ")
        if(i/2 == 5){
            break
            //It will print until 10.
        }

    }
        println("\nContinue")
    for (i in 1 until 20){
        if(i/2 == 5 && i%2 == 0){
            continue
            //It will not print 10
        }
        print("$i ")
    }




}