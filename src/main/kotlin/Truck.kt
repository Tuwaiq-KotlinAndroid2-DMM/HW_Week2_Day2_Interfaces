class Truck : Vehicle() {
	override fun changeGear(gear: Int) {
		if (isMoving() && (gear >= 1 && gear <= 10)) {
			this.gear = gear
		} else {
			this.gear = 0
		}
	}

	override fun speedUp() {
		this.speed += 5
	}
}