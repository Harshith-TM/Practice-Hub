//Kotlin program to display Grade using if-else ladder

fun main()
{
println("Enter Your Marks:") //Ask user to enter marks
var marks = readLine()!!.toInt()

//if-else ladder to calculate grade
if(marks >= 90){
println("Grade: A+")
}else if(marks >= 80){
println("Grade: A")
}else if(marks >= 70){
println("Grade: B")
}else if(marks >= 60){
println("Grade: C")
}else if(marks >= 50){
println("Grade: d")
}else if(marks >= 35){
println("PASS")
}else{
println("Better Luck Next Time")
}

}