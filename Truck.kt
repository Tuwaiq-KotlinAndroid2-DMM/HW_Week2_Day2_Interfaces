/*lass functions:

changeGear(int): Checks the engine if it started it will change the gear number to a number between 1 and 10 otherwise sets to zero.
speedUp(): Increments speed value by 5.*/
class Truck(startEngine:Boolean, speed:Int, gear:Int, override var type: String):Vehicle(startEngine,speed,gear,type),IVehicle {

    override fun changeGear(){
        if (startEngine == true){
            var oldValue = gear
            println(" gear: $oldValue")
        }else{
            var zoldValue = 0
            println(" gear: $zoldValue")
        }

    }

    override fun speedUp(){
        if(startEngine == true) {
            var result = speed * 5
            print("Speed : $result  ")
        }else{
            var Zresult = 0
            print("Speed : $Zresult  ")
        }

    }
}