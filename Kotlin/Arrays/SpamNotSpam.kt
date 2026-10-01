//Kotlin program to check whether the email subject is a spam or not using arraylist

fun main() {
  val emailSubjects = arrayListOf("Congratulations! You won a FREE prize","Free prize money","24 tips for healthy life")
  val spamWords = arrayListOf("free","win","winner","offer","urgent","money","prize")

  val spamOrNot = ArrayList<String>()

  for(subject in emailSubjects){
    var spamCount = 0
    for(words in spamWords){
      if(subject.lowercase().contains(words.lowercase())){
        spamCount+=1
      }
    }
    if(spamCount>=2){
      spamOrNot.add("Spam")
    }else{
      spamOrNot.add("Not Spam")
    }
  }
  println(spamOrNot)
}