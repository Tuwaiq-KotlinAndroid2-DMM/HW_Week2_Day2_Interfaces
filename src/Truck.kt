// Inherit from Vehicle class
class Truck : Vehicle() {

    // Function to override the changeGear function of the parent class
    override fun changeGear(gear: Int) {
        super.changeGear(gear)
        if (this.startEngine) {
            if ((gear in 1..10))
                this.gear = gear
        } else
            this.gear = 0
    }

    // Function to override the changeGear function of the parent class
    override fun seepUp() {
        this.speed += 5
    }

}