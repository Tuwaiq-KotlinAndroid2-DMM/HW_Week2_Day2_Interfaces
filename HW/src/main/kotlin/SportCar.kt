class SportCar(startEngine: Boolean, speed: Int, gear: Int, type: String): Vehicle(startEngine, speed, gear,type) {
    override fun changeGear(gearC: Int) {
        for (g in 1..5){
            if (startEngine) {
                gear=gearC
            }else gear=0
        }
    }

    override fun speedUp(): Int {
        speed+=20
        return speed
    }
}