class SportCar(type: String, startEngine: Boolean, speed: Int, gear: Int, override var type: String) :
    Vehicle(type, startEngine, speed, gear) {

    override fun changeGear(Gear: Int) {

        if (isMoving() && gear <= 5 && gear > 0) this.gear = gear
        else this.gear = 0
    }


    override fun speedUp() {
        speed = speed + 20
    }

    override fun printStates() {
        print("${Type} ")
        super.printStates()
    }
}
