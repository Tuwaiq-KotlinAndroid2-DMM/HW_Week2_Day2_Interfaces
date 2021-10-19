 class Truck(startEngine:Boolean, speed: Int, gear:Int, type: String): Vehicle(startEngine, speed, gear, type), Ivehicle {

    override fun speedUp(s: Int): Int{
        var s = 0
        s = if (startEngine){
            this.speed+5
        }else{
            0
        }
        return s
    }
    override fun changeGear(g: Int): Int{
        gear = if(startEngine){
            1
        }else {
            0
        }
        return gear
    }

}

