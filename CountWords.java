// Jase Ishimi, Lab Section 5
import java.util.Scanner;
import java.io.*;
public class CountWords {
public static void main(String[] args) {
	boolean check = true; // boolean check set to true
	Scanner Input= new Scanner(System.in);
	while(check=true){ // while true run loop
	System.out.println("Enter a String:"); // Get user input
	String character= Input.nextLine(); // set to string
	String characterCheck = character.toLowerCase(); // set to lowercase to check if user entered done
	if(characterCheck.contains("done")) { // check if user entered done
		 check=false; // if condition is true, set to check to false
		 break;
	}
	else { // else run code
	 int words = character.length(); // set words to character length
	 System.out.println("Your string has " +countWords(character) +" words and " + words + " characters");
	}
	
	}
}
public static int countWords(String character) {
	int wordAmount=0;
     for(int i = 0; i < character.length(); ++i) {
        
    	 char letter = character.charAt(i); // set char letter to the character at the string character's char at i
        if (i>0 && letter != ' ' && character.charAt(i-1)==' ' || character.charAt(0)!=' '&& i==0)  { 
        	//run if i is greater than 0, and if current character isn't blank but previous one is then add 1 to word amount
        	//check the first index at 0 and if it isn't blank then add 1 to word amount
          wordAmount++;                                                                               
        
        }
        
     }
     return wordAmount;
	
}

}