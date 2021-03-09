import kotlin.math.pow

fun main() {
    //variable that defines the operations
    val operation = getOperation()
    //get the two numbers and calculate the operation
    calculate(operation, arrayOf(getNumber(), getNumber()))
}

//get a valid float number from the user
fun getNumber(): Float {
    var aux: Float?
    print("Insert a number: ")
    while (true) {
        aux = readLine()!!.toFloatOrNull()
        if (aux != null) {
            break
        }
        print("You must insert a valid number\nInsert a number: ")
    }
    return aux!!
}


fun getOperation(): Int? {
    // temporary variable that will return the operation selected
    var aux: Int?

    //menu of operations
    print(
        "1 to add\n" +
                "2 to subtract\n" +
                "3 to multiply\n" +
                "4 to divide\n" +
                "5 to calculate the percentage\n" +
                "6 to raise a number to a power\n" +
                "Select the operation you desire: "
    )

    // Loop until it gets a valid selection number
    while (true) {
        aux = readLine()!!.toIntOrNull()
        if (aux in 1..6) break
        print("You must insert a valid number\nSelect the operation you desire: ")
    }
    return aux
}

//calculates and prints a different line for each calculation
fun calculate(operation: Int?, numbs: Array<Float>) {
    when (operation) {
        1 -> println("${numbs[0]} + ${numbs[1]} = " + (numbs[0] + numbs[1]))        //sum
        2 -> println("${numbs[0]} - ${numbs[1]} = " + (numbs[0] - numbs[1]))        //subtraction
        3 -> println("${numbs[0]} * ${numbs[1]} = " + (numbs[0] * numbs[1]))        //multiplication
        4 -> println("${numbs[0]} / ${numbs[1]} = " + (numbs[0] / numbs[1]))        //division
        5 -> println("${numbs[0]} is " + (numbs[0] / numbs[1])*100 + "% of ${numbs[1]}" )       //percentage
        6 -> println("${numbs[0]} ^ ${numbs[1]} = " + (numbs[0].pow(numbs[1])))         //power of n

    }
}