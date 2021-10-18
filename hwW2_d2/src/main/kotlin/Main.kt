fun main() {
    var c1 = SportCar("sportcar", true, 75, 2)
    var c2 = truk("truk", true, 20, 2)
    var c4 = truk("truk", true, 60, 9)
    var c3 = truk("truk", false, 0, 0)
    c1.printStates()
    c1.ismoving()
    println(" ")
    c1.speedUp()
    c1.changeGear(6)
    println(" ")
    c2.printStates()
    c2.ismoving()
    println(" ")
    c2.speedUp()
    c2.changeGear(2)
    println(" ")
    c3.printStates()
    c2.ismoving()
    println(" ")
    c3.speedUp()
    c3.changeGear(0)

}



