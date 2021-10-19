open class Vehicle() : IVehicle {
    var startEngine: Boolean = false
    var speed: Int = 0
    var gear: Int = 0
    override var type: String = ""

    override fun isMoving(): Boolean {
        if (speed > 0)
            return true
        return false
    }

    open fun speedUp() {
        speed++
    }

    open fun changeGear(newGear: Int) {
        gear = newGear
    }

    fun applyBrakes() {
        speed = 0
        gear = 0
    }

    fun _setType(newType: String) {
        type = newType
    }

    fun printStates() {
        if (speed > 0) {
            println("$type present state :(Moving)\n speed: $speed gear: $gear")
        } else println("$type present state :(Stopped)\n speed: $speed gear: $gear")
    }
}