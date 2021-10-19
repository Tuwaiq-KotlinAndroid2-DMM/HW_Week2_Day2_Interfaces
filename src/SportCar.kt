// Inherit from Vehicle class
class SportCar : Vehicle() {

    // Function to override the changeGear function of the parent class
    override fun changeGear(gear: Int) {
        super.changeGear(gear)
        if (this.startEngine) {
            if ((gear in 1..5))
                this.gear = gear
        } else
            this.gear = 0
    }

    // Function to override the speedUp function of the parent class
    override fun seepUp() {
        this.speed += 20
    }

}