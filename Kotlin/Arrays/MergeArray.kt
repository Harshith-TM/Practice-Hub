//Kotlin program to merge to arrays into one

fun main()
{
  val array1 = arrayOf(4,-2,0,7,-5,1,0,-8)
  val array2 = arrayOf(-3,9,0,-1,5,-7)
  val array1Size = array1.size
  val array2Size = array2.size
  val totalSize = array1Size + array2Size
  var mergedArray = IntArray(totalSize)
  var index = 0
  for(i in 0 until array1Size)
  {
    mergedArray[index] = array1[i]
    index++
  }
  for(i in 0 until array2Size)
  {
    mergedArray[index] = array2[i]
    index++
  }
  println("Array1: ${array1.contentToString()}, Size: $array1Size")
  println("Array2: ${array2.contentToString()}, Size: $array2Size")
  println("Merged Array: ${mergedArray.contentToString()}, Size: $totalSize")
}