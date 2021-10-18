class Truck(startEngine:Boolean,speed:Int,gear:Int,type:String) : Vehicle(startEngine,speed,gear,type) {


    override fun changeGear(num:Int) {
        if (isMoving() && num >= 1 && num <= 10)
            gear = num
        else gear = 0
    }

    override fun speedUp() {
        speed += 5

    }
}