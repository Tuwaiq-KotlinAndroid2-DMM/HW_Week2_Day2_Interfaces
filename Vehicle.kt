

open class Vehicle (var ScriptEngine:Boolean,var speed:Int,var gear:Int,override var Type:String): IVehicle{
       override fun isMoving() :Boolean= (speed >0)
       open fun speedUp() { speed++}

       open fun chaneGear(Gear:Int){
           if (ScriptEngine) {this.gear}
            else {this.gear=0} }

           fun applyBrakes() {speed=0}
           fun setType():String {return "Vehicle"}

               open fun PrintStates(){

               if (speed>0)
                     println("present state : (Moving).\nSpeed: $speed Gear:$gear")
                     else if (speed == 0)
                      println("present State :(Stoopped).\nSpeed: $speed Gear: $gear")

       }



}