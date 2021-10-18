
open class Vehicle(var startEngine: Boolean, var speed: Int, var gear: Int, override var type: String): IVehicle{
    override fun isMoving(): Boolean {
        return speed>0
    }

    open fun speedUp(speed: Int): Int{
        return this.speed++
    }
    open fun changeGear(g: Int): Int{
        gear = if(startEngine){
            1
        }else {
            0
        }
        return gear
    }
    fun applyBreaks(){
        speed = 0
    }
    fun setType(t: String): String{
        var t = type
        return t
    }
    open fun printStates(): String{
        return if (isMoving()){
            ("(Moving)")
        }else{
            ("(Stopped)")
        }

    }
}