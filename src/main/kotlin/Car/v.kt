import Car.SportCar
import Car.Truck
import Car.Vehicle

fun main() {
    var a = mutableListOf<Vehicle>()
    a.add(SportCar(true, 120,5,"Sport car"))
    a.add(Truck(false, 0,0,"Truck"))
    a.add(SportCar(true, 50,2,"Sport car"))
    a.add(Truck(true, 30,1,"Truck"))

    getSportCar(a)
    getTruck(a)
}
fun getSportCar(a:MutableList<Vehicle>){
    var counter = 0
    for (element in a){
        if (element is SportCar){
            println("${element.setType(element.type)} present state is ${element.printStates()} \nSpeed: ${element.speedUp(element.speed)} , Gear: ${element.changeGear(element.gear)}")
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