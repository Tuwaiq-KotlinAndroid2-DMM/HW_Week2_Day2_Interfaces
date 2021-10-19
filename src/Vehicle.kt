// Open class to be inherited, and it implements the IVehicle interface
open class Vehicle : IVehicle {

    // Class attributes/properties with default values
    protected var startEngine: Boolean = false
    protected var speed: Int = 0
    protected var gear: Int = 0
    override var type: String = ""

    // Function to speed up the speed by 1 as a default
    open fun seepUp() {
        speed++
    }

    // Function to change gear
    open fun changeGear(gear: Int) {
        this.gear = gear
    }

    // Function to apply breaks to stop the vehicle
    open fun applyBreaks() {
        this.speed = 0
        this.gear = 0
    }

    // Function to set type of vehicle
    open fun setVehicleType(type: String) {
        this.type = type
    }

    // Function to print all the states of vehicle
    open fun printStates() {
        if (isMoving())
            println(
                "$type present state is: (Moving)\n" +
                        "Speed: $speed\tGear: $gear"
            )
        else
            println(
                "$type present state is: (Stropped)\n" +
                        "Speed: $speed\tGear: $gear"
            )
    }

    // Function to start engine
    open fun startEngine(startEngine: Boolean) {
        this.startEngine = startEngine
    }

    // Function to implement interface function
    override fun isMoving(): Boolean {
        return speed > 0
    }
}