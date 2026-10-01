//Java program to check whether the email subject is a spam or not using arraylist

import java.util.*;

class SpamNotSpam {
    public static void main(String[] args) {
        List<String> emailSubjects = new ArrayList<>(Arrays.asList("Congratulations! You won a FREE prize","Free prize money","24 tips for healthy life"));
        List<String> spamWords = new ArrayList<>(Arrays.asList("free","win","winner","offer","urgent","money","prize"));
        
        List<String> spamOrNot = new ArrayList<>();

        for(String sub : emailSubjects){
            int spamCount = 0;
            for(String words : spamWords){
                if(sub.toLowerCase().contains(words.toLowerCase())){
                    spamCount+=1;
                }
            }
            if(spamCount>=2){
                spamOrNot.add("Spam");
            }else{
                spamOrNot.add("Not_Spam");
            }
        }
        System.out.println(spamOrNot);
    }
}