package WeekOneCapstonePigLatinSecondTry;

import java.util.Scanner;

public class WeekOneCapstonePigLatinSecondTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner (System.in);
        String userGivesWord;
        String userChoice = "yes"; // ask our user if they want to keep going.
                                                                        
        do {
            
            System.out.println("Please enter a word you want to see in Pig Latin"); //get user to enter word.
            userGivesWord = scnr.nextLine();
            userGivesWord = userGivesWord.toLowerCase();
            
            System.out.println("You have have entered : " + userGivesWord.toLowerCase());
            
            if(startsWithVowel(userGivesWord)){// Adds the text way on words that start with a vowel
            
             System.out.println("You have entered a word starting with a vowel, your pig latin word is :" + userGivesWord + "way");
            
            } else if (startsWithConsonant(userGivesWord)) {
                
                char firstLetter = userGivesWord.charAt(0);
                userGivesWord = userGivesWord.substring(1);
                System.out.println("You have entered a word starting with a consonant, your pig latin word is " + userGivesWord + firstLetter + "ay");
            }
                        
            System.out.println("Want to see how another word would look like in pig latin?");
            userChoice = scnr.nextLine();
            
            }while (userChoice.equalsIgnoreCase("yes"));
            
            System.out.println("Thank you for using this application!");
                        
            scnr.close();                                    
}

    private static boolean startsWithVowel(String way){
            
        
            char firstLetter = way.charAt(0);
        
            if (way.startsWith("a")){
                return true;                    
            }if (way.startsWith("e")){
                return true;                    
            }if (way.startsWith("i")){
                return true;
            }if (way.startsWith("o")){
                return true;    
            }if (way.startsWith("u")){
                return true;
            }
                return false;
}
    private static boolean startsWithConsonant(String constant){
        
        char firstLetter = constant.charAt(0);
            return true;
		
	}

}
