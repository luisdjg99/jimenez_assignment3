package jimenez_problem1;
import java.util.*;
import java.security.SecureRandom;

public class CAI2 {
	static SecureRandom random = new SecureRandom();
	static Scanner scnr = new Scanner(System.in);
	
	public static void main (String[] args) {
		
	quiz();
	
	
	
	
	}
	public static void quiz() {
		int first_num = random.nextInt(10);
		int second_num = random.nextInt(10);
		askQuestion(first_num, second_num);
	}
    public static void askQuestion(int first_num, int second_num) {
    	System.out.println("How much is " + first_num +" times" + second_num);
    	readResponse(first_num, second_num);
    }
    public static void readResponse(int first_num, int second_num) {
    	int ret = first_num * second_num;
    	int input = scnr.nextInt();
    	isAnswerCorrect(ret, input, first_num , second_num);
    }
    public static void isAnswerCorrect(int ret, int input, int first_num, int second_num) {
    	if (ret == input) {
    		displayCorrectResponse();
    	}else {
    		displayIncorrectResponse(first_num, second_num);
    	}
    }
    public static void displayCorrectResponse() {
    	int correct_response = 1 + random.nextInt(4);
    	switch(correct_response){
    	  case 1:
    		  System.out.println("Very good!");
    		  break;
    	  case 2:
    		  System.out.println("Excellent!");
    		  break;
    	  case 3:
    		  System.out.println("Nice work!");
    		  break;
    	  case 4:
    		  System.out.println("Keep up the good work!");
    		  break;
    	}
    }
    public static void displayIncorrectResponse(int first_num, int second_num) {
    	int incorrect_response = 1 + random.nextInt(4);
    	switch(incorrect_response){
    	  case 1:
    		  System.out.println("No. Please try again.");
    		  break;
    	  case 2:
    		  System.out.println("Wrong. Try once more.");
    		  break;
    	  case 3:
    		  System.out.println("Don’t give up!");
    		  break;
    	  case 4:
    		  System.out.println("No. Keep trying.");
    		  break;
    	}
    	askQuestion(first_num, second_num);
    }

}