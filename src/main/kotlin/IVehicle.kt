interface IVehicle {
    var startEngine: Boolean
    var speed: Int
    var gear: Int
    var vehicleType: String

    fun isMoving(): Boolean
    fun speedUp()
    fun changeGear(gear: Int)
    fun applyBrakes()
    fun printStates(): String
}