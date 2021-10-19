fun main() {
    var v = mutableListOf<Vehicle>()
    v.add(SportCar(true, 120,5,"Sport car"))
    v.add(Truck(true, 25,1,"Truck"))
    v.add(SportCar(false, 0,0,"Sport car"))
    v.add(SportCar(true, 0,0,"Sport car"))
    v.add(Truck(true, 40,3,"Truck"))
    v.add(SportCar(false, 0,0,"Sport car"))

    getSportCar(v)
    getTruck(v)
}
fun getSportCar(a:MutableList<Vehicle>){
    var counter = 0
    for (element in a){
        if (element is SportCar){
            println("${element.setType(element.type)} present state is ${element.printStates()} \n Speed: ${element.speedUp(element.speed)} , Gear: ${element.changeGear(element.gear)}")
            counter++
        }
    }
}

fun getTruck(a:MutableList<Vehicle>){
    var counter = 0

    for (element in a){
        if (element is Truck){
            println("${element.setType(element.type)} present state is ${element.printStates()} \nSpeed: ${element.speedUp(element.speed)} , Gear: ${element.changeGear(element.gear)}")
            counter++
        }
    }
}


