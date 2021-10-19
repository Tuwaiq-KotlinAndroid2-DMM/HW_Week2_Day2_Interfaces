class SportCar(override var type: String, startEngine: Boolean, speed: Int, gear: Int) :Vehicle(type,startEngine,speed,gear){

    override fun changeGear(g: Int) {
        super.changeGear(g)

        if(g in 1..5)
            if(startEngine)
                gear = g
        else
            gear=0
        println(gear)
    }

    override fun speedUp():Int {
        //super.speedUp()
        speed+=20
        return speed

    }
}


