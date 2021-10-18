fun main() {
var car1=SportCar("SportCar ",true,80,5)
var car2=Truck("Truck  ",true,40  ,2)
var car3=Truck("Truck ",false,0,0)
   print(car1.type)
    car1.printStates()
    car1.speedUp()
    car1.changeGear()
    print(car2.type)
    car2.printStates()
    car2.speedUp()
    car2.changeGear()
    print(car3.type)
    car3.printStates()
    car3.speedUp()
    car3.changeGear()
}

