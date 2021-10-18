fun main(args: Array<String>) {
    var sportCar = SportCar("Sport",true,80,5)
    var truckCar1 = Truck("Truck",true,40,2)
    var truckCar2 = Truck("Truck",false,0,0)

    println("SportCar Before The Change:")
    sportCar.printStates()
    sportCar.speedUp()
    sportCar.changeGear(4)
    println("SportCar After The Change:")
    sportCar.printStates()
    println("Truck:")
    truckCar1.printStates()
    truckCar2.printStates()





}