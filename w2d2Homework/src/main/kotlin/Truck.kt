class Truck(override var type: String, startEngine: Boolean, speed: Int, gear: Int) :
    Vehicle(type, startEngine, speed, gear) {
    override fun speedUp(): Int {
        speed += 5
        return speed
    }

    override fun changeGear(gearN: Int) {
        if (gearN in 1..10) {
            if (startEngine)
                gear = gearN
            else
                gear = 0
            println("The new gear state: $gear")
        }
        else
        println("The trucks' gear is between 1-10")
    }

    override fun printStates() {
        print("$type ")
        super.printStates()
    }
}