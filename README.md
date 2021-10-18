# HW_Week2_Day2_Interfaces
The Home Work has to be delievered before 9AM: ⚠️

> Note: You must save all your solution as `solution.kt` to be submitted before 9AM. ⚠️
# Instructions 📋


### Write an interface named 'IVehicle' with following features:

Interfce properties:
- type: string value

Interfce functions:
- isMoving()


### Write a class named 'Vehicle' which implements from IVehicle interface with following features:

Properties:
- startEngine: boolean value for the engine state
- speed: int value for the speed of the vehicle
- gear: int value for the gear number of the vehicle

class functions:
- isMoving(): Check if speed more than zero then reterns true otherwise false.
- speedUp(): Increments speed value.
- changeGear(int): Changes gear's numbers.
- applyBrakes(): Sets the speed to zero.
- setType(String): Sets the type of the vehicle.
- printStates(): Print the state of the vehicle either is moving or not.

### Write a subclass named 'SportCar' which inherents from Vehicle class with following features:

Class functions:
- changeGear(int): Checks the engine if it started it will change the gear number to a number between 1 and 5 otherwise sets to zero.
- speedUp(): Increments speed value by 20.

### Write a subclass named 'Truck' which inherents from Vehicle class with following features:

Class functions:
- changeGear(int): Checks the engine if it started it will change the gear number to a number between 1 and 10 otherwise sets to zero.
- speedUp(): Increments speed value by 5.


Output:
```console
SportCar present state : (Moving)
speed: 80 gear: 5
Truck present state : (Moving)
speed: 40 gear: 2
Truck present state : (Stopped)
speed: 0 gear: 0
```
