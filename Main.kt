fun main(){
    var v1 = Vehicle(true,80,5,"SportCar")
    var t1 = Truck(true,40,2,"Truck")
    var s1 = SportCar(false,80,2,"SportCar")

    v1.printStates()
    v1.speedUp()
    v1.changeGear()

    t1.printStates()
    t1.speedUp()
    t1.changeGear()

    s1.printStates()
    s1.speedUp()
    s1.changeGear()


}