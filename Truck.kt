
class Truck (ScriptEngine:Boolean,speed:Int,gear:Int,override var Type:String) : Vehicle(ScriptEngine,speed,gear,Type){

                       fun changeGear(Gear:Int){
                         if (isMoving() && gear>=1 && gear <=10)
                             this.gear =gear
                           else this.gear


                       }
                override fun speedUp(){
                    speed=speed+5

                }
              override fun PrintStates(){
                  print("${Type}")
                  super.PrintStates()
              }

}

