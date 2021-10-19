open class Vehicle(override var type: String, val startEngine: Boolean, var speed: Int=0, var gear: Int=0) :IVehicle{

      // val startEngine: Boolean=true
     // val  speed: Int=0
    // val gear: Int=0

    override fun isMoving():Boolean {

        if (speed>0)
            return true

        else
            return false

    }
    open fun speedUp():Int{
         return speed++
    }
    open fun changeGear(g:Int){
        gear = g
    }
    fun applyBreaks():Int{

        speed=0
        return speed
    }
    @JvmName("setType1")
    fun setType(t:String){

        this.type=t
    }

    fun printStates(){

        /*
        if (isMoving())
            println("Moving")
        else
            println("Stoped")

         */
        if(speed>0)
            println("$type present state: (Moving)\nspeed: $speed gear: $gear")
        else if (speed==0)
            println("present state: (Stopped) \nSpeed: $speed gear: $gear")

    }


}