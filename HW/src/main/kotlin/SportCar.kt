class SportCar(type: String, startEngine: Boolean, speed: Int, gear: Int):Vehicle(type, startEngine, speed, gear) {
    override fun changeGear() {
        val gearNumber = (1..5).random()
        if(speed>0){
println(" gear: $gearNumber")
        }else println(" gear: 0")
    }

    override fun speedUp() {
        if (speed !=0)
        speed += 20
        print("speed:$speed")
    }
}