package jimenez_problem1;
import java.util.*;
import java.security.SecureRandom;

public class CAI1 {
	
	static SecureRandom random = new SecureRandom();
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		quiz();
	}
	
	public static void quiz() {
		int first_num = random.nextInt(10);
		int second_num = random.nextInt(10);
		askQuestion(first_num, second_num);
		
	}
	
	public static void askQuestion(int first_num, int second_num) {
		System.out.println("How much is " + first_num + " times " + second_num);
		readResponse(first_num, second_num);
	}
	
	public static void readResponse(int first_num, int second_num) {
		int ret = first_num * second_num;
		int input = scnr.nextInt();
		isAnswerCorrect(ret, input, first_num, second_num);
	}
	
	public static void isAnswerCorrect(int ret, int input, int first_num, int second_num) {
		if(ret == input) {
			displayCorrectResponse();
			
		}
		else {
			displayIncorrectResponse(first_num, second_num);
		}
		
	}
	
	public static void displayCorrectResponse() {
		System.out.println("Very Good!");
	}
	
	public static void displayIncorrectResponse(int first_num, int second_num) {
		System.out.println("No. Please try again.");
		askQuestion(first_num, second_num);
		
	}

}
