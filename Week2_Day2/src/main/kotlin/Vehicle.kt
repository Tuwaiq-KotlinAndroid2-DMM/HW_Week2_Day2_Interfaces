open class Vehicle(var startEngine:Boolean,var speed :Int,var gear:Int):IVehicle {
    override var type: String
        get() = TODO("Not yet implemented")
        set(value) {
            type=value

        }

    override fun isMoving(): Boolean {
        if(speed>0)
            return true
        else
            return false
    }

    open fun speedUp(){
         speed++

    }

    open fun changeGear(num:Int){
        gear=num
    }

    fun applyBrakes(){
        speed=0
    }


    fun setTyp(t:String){
        type=t
    }

    fun printStates(){
        if(speed>0){
            println("present state : (Moving) \nSpeed: $speed Gear: $gear")
        }else if(speed==0){
            println("present state : (Stopped) \nSpeed: $speed Gear: $gear")
        }

    }


}