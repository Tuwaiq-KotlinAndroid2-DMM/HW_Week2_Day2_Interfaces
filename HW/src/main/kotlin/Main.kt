// getting IP Address from 10:05 - 10:06

import java.io.File

fun main() {

    var wWithING = mutableListOf<String>()
    var f = File("myfile.txt")


    var text = f.readLines()
    var lines = text.size
    var timeOf1005 = mutableListOf<String>()
    var listOfIpAdress = mutableListOf<String>()
    f.forEachLine { line ->

        var index1 = line.indexOf('[')
        var index2 = line.indexOf(']')
        var day = line.subSequence(index1 + 1..index1 + 11)
        var time = line.subSequence(index1+13 .. index1+17)
        var indexofFirstSpace = line.indexOf(' ')
        var ipAdress = line.subSequence(0 until indexofFirstSpace)
        if (day == "17/May/2015" && (time == "10:05" || time == "10:06") ) {
            listOfIpAdress.add(ipAdress.toString())
            timeOf1005.add(time.toString())
        }
    }

    println(timeOf1005)
    println(listOfIpAdress)
    println(timeOf1005.size)
    println(listOfIpAdress.size)
}