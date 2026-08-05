/*Given an integer array that does not contain any zeros, find the largest positive integer k such that -k also exists in the array. Return the positive integer k. If there is no such integer, return -1*/

import kotlin.math.*

fun main() {
  println("Enter an Integer array, with space to seperate each element")
  val input = readln().split("\\s+".toRegex())
  
  val arraySize = input.size
  var array = IntArray(arraySize)
  for(i in 0 until arraySize) {
      array[i] = input[i].toInt()
  }
  
  val largestNumber = findLargest(array,arraySize)
  
  if(largestNumber>0) {
    println("Largest positive number in array that has its alternative negative number is: $largestNumber")
  } else {
    println("No such element found")
  }
}

fun findLargest(array : IntArray, arraySize : Int) : Int {
  var largest = -1
  for(i in 0 until arraySize) {
    for(j in i+1 until arraySize) {
      var sum = array[i]+array[j]
        if(sum==0) {
          largest = max(largest,abs(array[i]))
        }
    }
  }
  return largest
}