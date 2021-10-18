class Truck( type: String, startEngine: Boolean, speed: Int, gear: Int) : Vehicle(type, startEngine, speed, gear) {


    override fun changeGear(Gear: Int) {
    if (isMoving() && gear>=1 && gear<=10)
        this.gear=gear
        else this.gear=0
    }

    override fun speedUp() {
        speed=speed+5
    }
    override fun printStates() {
        print("${Type} ")
        super.printStates()
    }
}

