fun main(args: Array<String>) {
    var car= mutableListOf<Vehicle>()
    car.add(SportCar(true,80,5,"sport car"))
    car.add(Truck(true,40,2,"truck"))
    car.add(Truck(false,0,0,"truck1"))


    println(prnitSport(car))
    println(prnitTrack(car))
}
fun prnitSport (car:MutableList<Vehicle>) {
    for (c in car)
        if (c is SportCar) {
            println("${c.setType1(c.type)} present state ( ${c.printStates()})\n Speed:${c.speedUp()}, Gear:${c.changeGear(4)}")
        }
}
fun prnitTrack (car:MutableList<Vehicle>) {
    for (t in car)
        if (t is Truck) {
            println("${t.setType1(t.type)} present state ( ${t.printStates()})\n Speed:${t.speedUp()}, Gear:${t.changeGear(t.gear)}")
        }
}




