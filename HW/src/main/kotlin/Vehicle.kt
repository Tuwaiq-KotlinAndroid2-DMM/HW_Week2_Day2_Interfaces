open class Vehicle(override var type: String, var startEngine:Boolean, var speed:Int, var gear:Int) :IVehicle{
//    isMoving(): Check if speed more than zero then reterns true otherwise false.
    override fun isMoving(): Boolean {
        if (speed>0){
            return true
        }
            return false
    }
//    speedUp(): Increments speed value.
open fun speedUp(){
   speed++
}
//    changeGear(int): Changes gear's numbers.
   open fun changeGear(){

    }
//    applyBrakes(): Sets the speed to zero.
    open fun applyBrakes(){
    speed==0
}
//    setType(String): Sets the type of the vehicle.
/*  open  fun setType(type: String):IVehicle{
return type
    }*/

//    printStates(): Print the state of the vehicle either is moving or not
   open fun printStates(){
    if(speed==0){
        println("present state :Stopped")
    }else println("present state :Moving")

    }
}