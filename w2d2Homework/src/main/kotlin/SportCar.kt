class SportCar(override var type: String, startEngine: Boolean, speed: Int, gear: Int) :
    Vehicle(type, startEngine, speed, gear) {
    override fun speedUp(): Int {
        speed += 20
        return speed
    }

    override fun changeGear(gearN: Int) {
        if (gearN in 1..5) {
            if (startEngine)
                gear = gearN
            else
                gear = 0
            println("The new gear state: $gear")
        }
        else
            println("The sport cars' gear is between 1-5")
    }

    override fun printStates() {
        print("$type ")
        super.printStates()
    }
}