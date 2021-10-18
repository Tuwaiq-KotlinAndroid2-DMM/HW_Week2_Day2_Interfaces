fun main() {

    var sporty = SportCar(false, 0, 3, "")
    var truck = Truck(false, 0, 3, "")

    sporty.set_Type("BMW")
    truck.set_Type("GMC")



    if (sporty.isMoving()) {
        println(
            """
        ${sporty.type} car present state : (Moving)
        speed: ${sporty.speed} gear: ${sporty.changeGear()}
    """.trimIndent()
        )
    } else {
        println(
            """
        ${sporty.type} car present state : (Stopped)
        speed: ${sporty.speed} gear: ${sporty.changeGear()}
    """.trimIndent()
        )
    }
    if (truck.isMoving()) {
        println(
            """
        ${truck.type} truck present state : (Moving)
        speed: ${truck.speed} gear: ${truck.changeGear()}
    """.trimIndent()
        )
    } else {
        println(
            """
        ${truck.type} truck present state : (Moving)
        speed: ${truck.speed} gear: ${truck.changeGear()}
        """.trimIndent()
        )
    }

}

interface IVehicle {
    var type: String

    fun isMoving(): Boolean
}

open class Vehicle(var startEngine: Boolean, var speed: Int, var geer: Int, override var type: String) : IVehicle {
    override fun isMoving(): Boolean {
        if (speed > 0) return true
        return false
    }

    open fun speedUp() {
        speed++
    }

    open fun changeGear():Int {

    return geer
    }

    fun applyBrakes() {
        speed = 0
    }

    fun set_Type(newType: String) {
        type = newType
    }

    fun printStates() {
        if (isMoving()) println("The state of the vehicle: Moving")
        else println("The state of the vehicle: Stopped")
    }


}

class SportCar(startEngine: Boolean, speed: Int, geer: Int, type: String) : Vehicle(startEngine, speed, geer, type) {
    override fun changeGear(): Int {
        if (isMoving()) {
            when (speed) {
                in 1..20 -> geer = 1
                in 21..40 -> geer = 2
                in 41..80 -> geer = 3
                in 81..100 -> geer = 4
                in 101..160 -> geer = 5
                in 161..260 -> geer = 6
                else -> geer = 0
            }

        } else geer = 0
        return geer
    }

    override fun speedUp() {
        speed += 20
    }
}


class Truck(startEngine: Boolean, speed: Int, geer: Int, type: String) : Vehicle(startEngine, speed, geer, type) {
    override fun changeGear():Int {
        if (isMoving()) {
            when (speed) {
                in 1..20 -> geer = 1
                in 21..30 -> geer = 2
                in 31..45 -> geer = 3
                in 46..60 -> geer = 4
                in 61..70 -> geer = 5
                in 71..85 -> geer = 6
                in 86..90 -> geer = 7
                in 91..100 -> geer = 8
                in 101..110 -> geer = 9
                in 111..120 -> geer = 10
                else -> geer = 0
            }
        } else geer = 0
        return geer
    }

    override fun speedUp() {
        speed += 5
    }
}