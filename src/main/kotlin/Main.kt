
fun main() {
    vehicleOne()
    vehicleTwo()
    vehicleThree()
}

fun vehicleOne(){
    val sportsCar = SportCar()
    sportsCar.startVehicle()
    sportsCar.speedUp()
    sportsCar.speedUp()
    sportsCar.changeGear(5)
    sportsCar.speedUp()
    println(sportsCar.printStates())
}
fun vehicleTwo(){
    val truck = Truck()
    truck.startVehicle()
    truck.speedUp()
    truck.changeGear(2)
    truck.speedUp()
    truck.speedUp()
    truck.changeGear(3)
    truck.speedUp()
    truck.speedUp()
    truck.changeGear(2)
    truck.speedUp()
    truck.speedUp()
    println(truck.printStates())
}
fun vehicleThree(){
    val truck2 = Truck()
    truck2.startVehicle()
    truck2.speedUp()
    truck2.changeGear(2)
    truck2.parkVehicle()
    println(truck2.printStates())
}