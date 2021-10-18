interface IVehicle {
	var type: String
	var startEngine: Boolean
	var speed: Int
	var gear: Int

	fun isMoving(): Boolean
}