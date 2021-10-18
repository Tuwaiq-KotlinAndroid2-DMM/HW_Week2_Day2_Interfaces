class Truck(startEngine:Boolean,speed:Int,gear:Int):Vehicle(startEngine, speed, gear){
    override fun speedUp() {

        speed+=5
    }

    override fun changeGear(num: Int) {

        if(num in 1..10){
            if(startEngine==true) {
                gear = num
            }
            else
                gear=0
        }else {
            println("This number is out of range")
        }


    }



}