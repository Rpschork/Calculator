fun main() {
    //variable that defines the operations
    var oper:Int?

    //menu of operations
    print("1 to add\n" +
            "2 to subtract\n" +
            "3 to multiply\n" +
            "4 to divide\n" +
            "Select the operation you desire: ")

    // Loop until it gets a valid selection number
    while(true) {
        oper = readLine()!!.toIntOrNull()
        if (oper != null && oper in 1..4) break
        print("You must insert a valid number\nSelect the operation you desire: ")
    }
}