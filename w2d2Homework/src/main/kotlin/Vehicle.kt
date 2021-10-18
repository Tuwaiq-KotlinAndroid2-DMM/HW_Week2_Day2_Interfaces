open class Vehicle(override var type: String, var startEngine: Boolean, var speed: Int, var gear: Int) : IVehicle {

    override fun isMoving(): Boolean {
        if (speed > 0)
            return true
        else
            return false
    }

    open fun speedUp(): Int {
        return speed++
    }

    open fun changeGear(gearN: Int) {
        gear=gearN
    }

    fun applyBreaks(): Int {
        speed = 0
        return speed
    }

    open fun printStates() {
        if (speed > 0)
            println("Present State: (Moving).\nSpeed: $speed Gear: $gear")
        else if (speed == 0)
            println("Present State: (Stopped).\nSpeed: $speed Gear: $gear")
    }
}
