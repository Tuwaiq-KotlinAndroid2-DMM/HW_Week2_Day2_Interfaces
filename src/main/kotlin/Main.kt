fun main() {
	val sportCar = SportCar()
	sportCar.setType("SportCar")
	sportCar.startEngine = true
	sportCar.changeGear(1)
	sportCar.speedUp()
	sportCar.changeGear(3)
	sportCar.speedUp()
	sportCar.printStates()

	val truck = Truck()
	truck.setType("Truck")
	truck.startEngine = true
	truck.changeGear(1)
	truck.speedUp()
	truck.speedUp()
	truck.changeGear(2)
	truck.speedUp()
	truck.speedUp()
	truck.printStates()

	sportCar.applyBrakes()
	sportCar.printStates()
}