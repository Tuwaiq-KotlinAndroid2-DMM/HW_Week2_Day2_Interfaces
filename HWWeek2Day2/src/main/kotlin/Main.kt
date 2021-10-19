fun main() {

    var sportCar = SportCar()
    sportCar._setType("Sport Car")
    sportCar.startEngine = true
    sportCar.speedUp()
    sportCar.changeGear(4)
    sportCar.printStates()

    var truck = Truck()
    truck._setType("Truck")
    truck.startEngine = true
    truck.speedUp()
    truck.changeGear(3)
    truck.printStates()

    truck.applyBrakes()
    truck.printStates()

}

