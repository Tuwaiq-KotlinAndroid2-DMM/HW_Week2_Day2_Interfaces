class truk(override var type: String, startEngin: Boolean, speed: Int, gear: Int):Vehicle(type,startEngin,speed,gear) {

    override fun changeGear(num: Int) {
        if (startEngin==true){
            gear=(1..10).random()

        }else{
            gear=0
        }
        print("  gear : $gear")

    }

    override fun speedUp() {
        if (speed>0)
        speed=20+speed

    print(" speed : $speed")

}}
