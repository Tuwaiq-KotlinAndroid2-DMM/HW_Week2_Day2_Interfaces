class SportCar(override var type: String, startEngin: Boolean, speed: Int, gear: Int):Vehicle(type,startEngin,speed,gear) {


    override fun changeGear(num: Int) {
if (startEngin==true){
    gear=(1..5).random()
}else{
    gear=0
}
        print("  gear : $gear")
    }

    override fun speedUp() {
        if (speed>0)
        speed=speed+5
        print(" speed : $speed")
    }

}