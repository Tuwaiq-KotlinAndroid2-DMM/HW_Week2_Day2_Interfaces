open class Vehicle(var startEngine: Boolean, var speed: Int, var gear: Int, override var type: String) : IVehicle {


    override fun isMoving(): Boolean {


        return speed > 0
    }


    open fun speedUp() {

        speed++

    }

    open fun changeGear(num: Int) {
        gear = num
    }

    fun applyBrakes() {

        speed = 0

    }

    internal fun setType(name: String) {
        type = name

    }

    fun printStates() {

        if (speed == 0) {
            println("$type present state :(Stopped)\nspeed: 0 gear: 0")
        }
        else{ println("$type present state : (Moving) \nspeed: $speed gear: $gear")

        }

    }

}