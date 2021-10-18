
/*Properties:

startEngine: boolean value for the engine state
speed: int value for the speed of the vehicle
gear: int value for the gear number of the vehicle
class functions:

isMoving(): Check if speed more than zero then reterns true otherwise false.
speedUp(): Increments speed value.
changeGear(int): Changes gear's numbers.
applyBrakes(): Sets the speed to zero.
setType(String): Sets the type of the vehicle.
printStates(): Print the state of the vehicle either is moving or not.*/

open class Vehicle(var startEngine:Boolean, var speed:Int, var gear:Int, override var type: String):IVehicle {

    override fun isMoving(){
        if(speed > 0)
            println(true)
        else
             println(false)
    }


    open fun speedUp(){
      // var result = speed * multiplayBy
        print("speed: $speed   ")
    }


    open fun changeGear(){
        if (startEngine == true){
            var oldValue = gear
            println(" gear: $oldValue")
        }else{
            var zoldValue = 0
            println(" gear: $zoldValue")
        }



    }


    fun applyBrakes(speed: Int){
        if(speed != 0) {
            var breaks = speed -  gear
            println(breaks)
        }
        else
            println(0)
    }


    fun setType(type: String):String{
        return type
    }


    fun printStates(){

        if(startEngine == true) {
            var state = " (Moving)"
            println("$type present state: $state")

        }else{
        var state = " (Stopped)"
        println("$type present state: $state")}

    }


}



