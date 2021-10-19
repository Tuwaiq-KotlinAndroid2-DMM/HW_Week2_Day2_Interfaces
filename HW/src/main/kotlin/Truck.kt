class Truck(startEngine: Boolean, speed: Int, gear: Int, override var type: String): Vehicle(startEngine, speed, gear,type) {


    override fun changeGear(gearC: Int) {
        for (g in 1..10){
            if (startEngine) {
                gear=gearC
            }else gear=0
        }
    }
    override fun speedUp(): Int {
        speed+=5
        return speed
    }


}