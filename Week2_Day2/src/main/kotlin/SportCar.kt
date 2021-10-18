class SportCar(startEngine: Boolean, speed: Int, gear: Int) : Vehicle(startEngine, speed, gear) {
    override fun speedUp() {
        speed += 20
    }

    override fun changeGear(num: Int) {
        super.changeGear(num)
        if (num in 1..5) {
            if (startEngine == true) {
                gear = num
            } else {
                gear = 0
            }
        } else {
            println("This number is out of range")
        }
    }}

