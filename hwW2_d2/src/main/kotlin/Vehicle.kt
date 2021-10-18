open class Vehicle(override var type: String, var startEngin: Boolean, var speed: Int, var gear: Int) : iVehicle {


    override fun ismoving():Boolean{
        if (speed > 0) {
            return true
        }
        else {
           return false
        }
    }

    open fun speedUp() {
        speed += speed
    }

    open fun changeGear(num: Int) {

    }

    fun applyBrakes() {
        speed == 0
    }

    fun setType() {

    }

    fun printStates() {
        if (speed>0){
        print("$type present state : (moving)")}
        else{        print("$type present state : (stopped)")}
    }
    }
