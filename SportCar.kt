class SportCar (ScriptEngine:Boolean,speed:Int,gear:Int,override var Type:String): Vehicle(ScriptEngine,speed,gear,Type){


    fun changeGear(gear:Int){
          if (isMoving()&& gear<=5 && gear>0) this.gear=gear
               else this .gear = 0
             speedUp()
        speed = speed + 28

}
    override fun speedUp(){
        speed=speed+5

    }

    override fun PrintStates(){

        if (speed>0)
            println("present state : (Moving).\nSpeed: $speed Gear:$gear")
        else if (speed == 0)
            println("present State :(Stoopped).\nSpeed: $speed Gear: $gear")

    }

}


