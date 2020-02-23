package jimenez_problem1;
import java.util.*;
import java.security.SecureRandom;
	
public class CAI3 {
	
		static SecureRandom random = new SecureRandom();
		static Scanner scnr = new Scanner(System.in);
		static int correct = 0;
		static int incorrect = 0;
		static int count = 0;
		
		public static void main (String[] args) {
		
		quiz();
		
		
		
		
		}
		public static void quiz() {
			int first_num = random.nextInt(10);
			int second_num = random.nextInt(10);
			askQuestion(first_num, second_num);
		}
	    public static void askQuestion(int first_num, int second_num) {
	    	System.out.printf("How much is %d times %d?\n", first_num, second_num);
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
	    		  correct++;
	    		  count++;
	    		  break;
	    	  case 2:
	    		  System.out.println("Excellent!");
	    		  correct++;
	    		  count++;
	    		  break;
	    	  case 3:
	    		  System.out.println("Nice work!");
	    		  correct++;
	    		  count++;
	    		  break;
	    	  case 4:
	    		  System.out.println("Keep up the good work!");
	    		  correct++;
	    		  count++;
	    		  break;
	    	}
	    	if (count == 10) {
	    		displayCompletionMessage();
	    	}else {
	    	quiz();
	    	}
	    }
	    public static void displayIncorrectResponse(int first_num, int second_num) {
	    	int incorrect_response = 1 + random.nextInt(4);
	    	switch(incorrect_response){
	    	  case 1:
	    		  System.out.println("No. Please try again.");
	    		  incorrect++;
	    		  count++;
	    		  break;
	    	  case 2:
	    		  System.out.println("Wrong. Try once more.");
	    		  incorrect++;
	    		  count++;
	    		  break;
	    	  case 3:
	    		  System.out.println("Don’t give up!");
	    		  incorrect++;
	    		  count++;
	    		  break;
	    	  case 4:
	    		  System.out.println("No. Keep trying.");
	    		  incorrect++;
	    		  count++;
	    		  break;
	    	}
	    	if (count == 10) {
	    		displayCompletionMessage();
	    	}else {
	    	quiz();
	    	}
	    }
   public static void displayCompletionMessage() {
	   int average = (correct*10);
	   System.out.println("Your score is " + average);
	   if (average > 75) {
		   System.out.println("Congratulations, you are ready to go to the next level!");
	   }else if (average < 75) {
		   System.out.println("Please ask your teacher for extra help.");
	   }
       
   }
	    
	    
	    
	}

