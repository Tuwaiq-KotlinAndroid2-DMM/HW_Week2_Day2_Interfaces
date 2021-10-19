class Truck(override var type: String, startEngine: Boolean, speed: Int, gear: Int) :Vehicle(type,startEngine,speed,gear){

    override fun changeGear(g: Int) {
        super.changeGear(g)

        if(g in 1..10)
            if(startEngine)
                gear = g
            else
                gear=0
        println(gear)
    }

    override fun speedUp():Int {
        //super.speedUp()
        speed+=5
        return speed

    }
}