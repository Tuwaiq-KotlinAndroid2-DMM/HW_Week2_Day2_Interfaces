fun main(args: Array<String>) {
    var sport1 = SportCar("SportCar", true,80,5)
    var truck1 = Truck("Truck",true, 40,2)
    var truck2 = Truck("Truck",false,0,0)

    println("sport1 speed: ${sport1.speed} | Its speed after applying speedUp: ${sport1.speedUp()}")
//    print("Changing sport1's: ")
//    sport1.changeGear(7)
//    print("Changing truck1's: ")
//    sport1.changeGear(4)
//    println("")
    print("Change sport1 gear number: ")
    var userInput = Integer.valueOf(readLine())
    sport1.changeGear(userInput)
    print("Change truck1 gear number: ")
    userInput = Integer.valueOf(readLine())
    truck1.changeGear(userInput)
    println("")

    sport1.printStates()
    truck1.printStates()
    truck2.printStates()
}