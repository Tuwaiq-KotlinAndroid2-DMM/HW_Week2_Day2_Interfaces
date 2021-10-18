open class Vehicle ():IVehicle{
    override var startEngine: Boolean = false
    override var speed: Int = 0
    override var gear: Int = 0
    override var vehicleType: String = ""

    //Start the vehicle engine and begin moving
    fun startVehicle(){
        if (!startEngine){
            startEngine = true
            speedUp()
            changeGear(1)
        }
    }

    //stop the vehicle engine and stop moving
    fun parkVehicle(){
        if (startEngine){
            startEngine = false
            applyBrakes()
            changeGear(0)
        }
    }

    //Check if vehicle is moving
    override fun isMoving(): Boolean = (speed > 0)

    //Increase speed of vehicle
    override fun speedUp() {speed += 5}

    //change the vehicle gear
    override fun changeGear(gear: Int) {
        if (startEngine) this.gear = gear else this.gear = 0
    }

    //stop the vehicle
    override fun applyBrakes() { this.speed = 0 }

    //display vehicle status
    override fun printStates() = """
            $vehicleType present state : (${if (isMoving()) "Moving" else "Stopped"})
            speed: $speed gear: $gear
        """.trimIndent()

}