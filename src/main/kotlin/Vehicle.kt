open class Vehicle() : IVehicle {
	override var speed: Int = 0
	override var gear: Int = 0
	override var startEngine: Boolean = false
	override var type: String = ""

	override fun isMoving() = this.speed > 0

	open fun speedUp() {
		speed ++
	}

	open fun changeGear(gear: Int) {
		this.gear = gear
	}

	fun applyBrakes() {
		speed = 0
		gear = 0
	}

	@JvmName("setType1")
	fun setType(newType: String) {
		this.type = newType
	}

	fun printStates() {
		println("(${this.type}) ${if (speed > 0) "The vehicle is moving.\nSpeed: $speed\tGear: $gear" else "The vehicle is not moving at all.\nSpeed: $speed\tGear: $gear"}")
	}
}