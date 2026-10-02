//Kotlin program to find first non repeated character in a string

fun main(){
  val str = "aabbbccccddeeeeeefghhhiiij"
  for(i in 0..str.length){
    val ch = str[i]
    if(str.indexOf(ch)==str.lastIndexOf(ch)){
      println("First Non-repeated Character: $ch")
      break
    }
  }
}