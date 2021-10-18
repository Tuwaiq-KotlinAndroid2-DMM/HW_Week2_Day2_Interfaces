class Truck(type: String, startEngine: Boolean, speed: Int, gear: Int): Vehicle(type, startEngine, speed, gear) {
    override fun changeGear() {
        val gearNumber = (1..10).random()
        if(speed==0){
            println(" gear: 0")
        }else println(" gear: $gearNumber")
    }

    override fun speedUp() {
        if (speed !=0)
        speed += 5
        print("speed:$speed")
    }
}