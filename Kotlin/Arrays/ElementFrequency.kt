//Kotlin program to find frequency of each element in array

fun main() {
  val array = arrayOf(0,1,3,0,5,3,5,1,-1,-5)
  val arraySize = array.size
  var visited = BooleanArray(arraySize)
  
  for(i in 0 until arraySize) {
      if(visited[i]) {continue}
      var count = 1
      for(j in i+1 until arraySize) {
          if(array[i]==array[j]) {
              count++
              visited[j] = true
          }
      }
      println("${array[i]} occurs $count number of times")
  }
}