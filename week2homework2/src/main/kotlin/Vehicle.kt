open class Vehicle(override var Type: String, var startEngine: Boolean, var speed: Int, var gear: Int) : IVehicle {

    override fun isMoving(): Boolean = (speed > 0)

    open fun speedUp() {
        speed++
    }
    open fun changeGear(Gear: Int) {
        if (startEngine) {
            this.gear
        } else {
            this.gear = 0
        }
    }


    fun applyBrakes() {
        speed = 0
    }

    fun setType(): String {
        return "Vehicle"
    }

    open fun printStates() {
        if (speed > 0)
            println("Present State: (Moving).\nSpeed: $speed Gear: $gear")
        else if (speed == 0)
            println("Present State: (Stopped).\nSpeed: $speed Gear: $gear")
    }
}

