class Truck() :Vehicle() {
    override var vehicleType: String = "Truck"

    //Increase a sports car by 5
    override fun speedUp() {speed += 5}

    //change the sports car gear if it is between 0 and 10 else set it to 0
    override fun changeGear(gear: Int) {
        if (isMoving() && (gear <= 10 && gear > 0)) this.gear = gear else this.gear = 0
    }

}