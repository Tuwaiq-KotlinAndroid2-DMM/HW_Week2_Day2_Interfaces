class SportCar() :Vehicle() {
    //Set the type of vehicle
    override var vehicleType: String = "Sports car"

    //Increase a sports car by 20
    override fun speedUp() {speed += 20}

    //change the sports car gear if it is between 0 and 5 else set it to 0
    override fun changeGear(gear: Int) {
        if (isMoving() && (gear <= 5 && gear > 0)) this.gear = gear else this.gear = 0
    }

}