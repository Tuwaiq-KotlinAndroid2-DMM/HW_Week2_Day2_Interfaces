open class Vehicle(var startEngine: Boolean, var speed: Int, var gear: Int, override var type: String):IVehicle {

    override fun isMoving():Boolean {
        return speed>0
    }
    open fun speedUp(): Int {
        return speed++
    }
    open fun  changeGear(gearC: Int) {
        if (startEngine>true)
         gear=gearC
    }
    fun applyBrakes(){
        speed=0
    }
    fun setType1(type1:String) {
        type=type1
    }
    fun printStates(): String {
        return if (isMoving()) {
            "vehicle is moving"
        }else "vehicle is stop"
    }
}