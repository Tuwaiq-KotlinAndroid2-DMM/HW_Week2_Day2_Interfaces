import java.io.File

fun main(args: Array<String>) {

    var arr=readFile("student.text")
    var oldeStudent=getoldstudent(arr)

println(oldeStudent.name+" "+oldeStudent.age+" "+oldeStudent.gpa)


}
fun readFile(fileName:String): Array<Student?> {

    var F=File(fileName)
    var line=F.readLines().size
    var a= arrayOfNulls<Student>(line)
    var index=0
    F.forEachLine { line ->
        var tokens = line.split(",")
        var name = tokens[0]
        var age = tokens[1].toInt()
        var gpa = tokens[2].toFloat()
        var stu = Student(name, age, gpa)
        a[index] = stu
        index++

    }
    return a

}

fun getoldstudent(arr:Array<Student?>):Student{

    var max = arr[0]
    for (stu in arr){

        if (stu!!.age>max!!.age){
            max=stu
        }
    }
        return max!!
    }



