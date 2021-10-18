fun main(args: Array<String>) {
    var sport = SportCar(true,80,5)
    var truck1 = Truck(true,40,2)
    var truck2 = Truck(false,0,0)



    println("SportCar Before The Change:")
    sport.printStates()
    sport.speedUp()
    sport.changeGear(4)
    println("SportCar After The Change:")
    sport.printStates()
    println("Truck:")
    truck1.printStates()
    truck2.printStates()





}