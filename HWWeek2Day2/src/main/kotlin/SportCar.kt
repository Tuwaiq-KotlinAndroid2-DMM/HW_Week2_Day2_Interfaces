class SportCar() : Vehicle() {
    override fun changeGear(newGear: Int) {
        if (isMoving() && newGear >= 1 && newGear <= 5)
            gear = newGear
        else gear = 0

    }

    override fun speedUp() {
        speed += 20
    }

}