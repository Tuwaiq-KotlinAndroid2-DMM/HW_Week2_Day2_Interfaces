interface IVehicle {
    var type: String
    open fun isMoving(): Boolean
}

open class Vehicle(override var type: String, var startEngine: Boolean, var speed: Int, var gear: Int) : IVehicle {
    override fun isMoving(): Boolean {
        if (speed > 0) {
            return true
        } else {
            return false
        }
    }

    open fun speedUp() {
        speed += speed
    }

    open fun changeGear(num: Int) {

    }

    fun applyBrakes() {
        speed == 0
    }

    fun setType() {

    }

    fun printStates() {
        if (speed > 0) {
            print("$type present state : (moving)")
        } else {
            print("$type present state: (stopped)")
        }
    }
}

class truck(override var type: String, startEngine: Boolean, speed: Int, gear: Int) :
    Vehicle(type, startEngine, speed, gear) {
    override fun changeGear(num: Int) {
        if (startEngine == true) {
            gear = (1..10).random()

        } else {
            gear = 0
        }
        print(" Gear : $gear ")
    }

    override fun speedUp() {
        if (speed > 0)
            speed = 20 + speed
        print("Speed: $speed ")
    }
}

class SportCar(override var type: String, startEngine: Boolean, speed: Int, gear: Int) :
    Vehicle(type, startEngine, speed, gear) {

    override fun changeGear(num: Int) {
        if (startEngine == true) {
            gear = (1..5).random()
        } else {

            gear = 0
        }
        print(" gear: $gear ")
    }

    override fun speedUp() {
        if (speed > 0)
            speed = speed + 5
        print("Speed: $speed")
    }

}

fun main() {
    var veh1 = SportCar("SportCar", true, 75, 2)
    var veh2 = truck("Truck", true, 20, 2)
    var veh4 = truck("Truck", true, 60, 9)
    var veh3 = truck("Truck", false, 0, 0)
    veh1.printStates()
    veh1.isMoving()
    println("")
    veh1.speedUp()
    veh1.changeGear(0)
    println("")

    veh2.printStates()
    veh2.isMoving()
    println("")
    veh2.speedUp()
    veh2.changeGear(1)
    println("")

    veh3.printStates()
    veh3.isMoving()
    println("")
    veh3.speedUp()
    veh3.changeGear(0)

}