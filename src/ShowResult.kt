// This file to run application and test all the classes
fun main(args: Array<String>) {

    // Create instance from SportCar class
    var sportCar = SportCar()

    // Start engine of Sport car
    sportCar.startEngine(true)

    // Set type of vehicle
    sportCar.setVehicleType("Sport Car")

    // set gear of vehicle to 1 and speed up
    sportCar.changeGear(1)
    sportCar.seepUp()

    // set gear of vehicle to 2 and speed up
    sportCar.changeGear(2)
    sportCar.seepUp()

    // set gear of vehicle to 3 and speed up
    sportCar.changeGear(3)
    sportCar.seepUp()

    // set gear of vehicle to 4 and speed up
    sportCar.changeGear(4)
    sportCar.seepUp()

    // set gear of vehicle to 5
    sportCar.changeGear(5)

    // Print all the states of Sport Car
    sportCar.printStates()

    // Create instance from Truck class
    var truck = Truck()

    // Start engine of Truck
    truck.startEngine(true)

    // Set type of vehicle
    truck.setVehicleType("Truck")

    // set gear of vehicle to 1 and speed up
    truck.changeGear(1)
    truck.seepUp()
    truck.seepUp()
    truck.seepUp()
    truck.seepUp()

    // set gear of vehicle to 2 and speed up
    truck.changeGear(2)
    truck.seepUp()
    truck.seepUp()
    truck.seepUp()
    truck.seepUp()

    // Print all the states of the Truck
    truck.printStates()

    // Hold breaks of the Truck
    truck.applyBreaks()

    // Print all the states of the Truck
    truck.printStates()

}