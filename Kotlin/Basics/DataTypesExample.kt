//Kotlin datatypes

fun main() {

    //val = immutable, var = mutable
    val employeeId:Int = 101
    val employeeName:String = "Aman"
    val basicSalary:Double = 35000.75
    val bonus:Float = 5000.50f  //suffix f for the value else it will be considered Double
    val grade:Char = 'A'
    val isPermanent:Boolean = true

    val totalSalary = basicSalary + bonus

    println("Employee ID      : $employeeId")
    println("Employee Name    : $employeeName")
    println("Grade            : $grade")
    println("Permanent Staff  : $isPermanent")
    println("Total Salary     : $totalSalary")

    //variables can also be declared as (val/var variableName = value). Kotlin automatically detects it.
}