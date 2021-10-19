fun main (){
    var sportCar =SportCar(true,80,5,"SportCar")
    var truckCar1 = Truck(true,80,4,"Truck")
    var trukCar2 = Truck(false,40,2,"Truck")

    println("SportCar Before The Change:")
    sportCar.PrintStates()
    sportCar.speedUp()
    sportCar. changeGear(4)
    println("SportCar After The Change:")
    sportCar.PrintStates()
    println("Truck")
    truckCar1.PrintStates()
    trukCar2.PrintStates()


}