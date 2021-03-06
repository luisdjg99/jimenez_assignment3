package jimenez_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {

static SecureRandom random = new SecureRandom();
static Scanner scnr = new Scanner(System.in);
static int correct = 0;
static int incorrect = 0;
static int count = 0;
static int n = 0;
static int a = 0;
static int y = 0;
static int z = 0;

public static void main (String[] args) {

quiz();




}
public static void quiz() {
	if (a == 0) {
		a++;
		readDifficulty();
		readProblemType();
	}
	if (y == 5) {
		y = 1 + random.nextInt(4);
		z = 5;
	}
	generateQuestionArgument();	
	
}
public static void readDifficulty() {
	System.out.println("Please enter the level number of difficulty that you would like to answer");
	System.out.println("1-Numbers from 0 to 9(inclusive)");
	System.out.println("2-Numbers from 0 to 99(inclusive)");
	System.out.println("3-Numbers from 0 to 999(inclusive)");
	System.out.println("4-Numbers from 0 to 9999(inclusive)");
	n = scnr.nextInt();
}
public static void readProblemType() {
	System.out.println("Select the number option that you would like to do");
	System.out.println("1- Addition\n" + "2- Multiplication\n" + "3- Subtraction\n" + "4- division\n" + "5- Random mix");
	y = scnr.nextInt();
	
	
}
public static void generateQuestionArgument() {
	int first_num = 0;
	int second_num = 0;
	if (n == 1) {
		 first_num = random.nextInt(10);
	     second_num = random.nextInt(10);
	}else if (n == 2) {
		first_num = random.nextInt(100);
	     second_num = random.nextInt(100);
	}else if (n == 3) {
		first_num = random.nextInt(1000);
	     second_num = random.nextInt(1000);
	}else if(n == 4) {
		first_num = random.nextInt(10000);
	     second_num = random.nextInt(10000);
	}else {
		System.out.println("Your input for level is not valid, please try again");
		readDifficulty();
	}
	if (y == 4) {
		if(second_num == 0) {
			generateQuestionArgument();
		}
	}
	
	askQuestion(first_num, second_num);
}
public static void askQuestion(int first_num, int second_num) {
	switch(y) {
	case 1:
		System.out.println("How much is " + first_num +" plus " + second_num);
		break;
	case 2:
		System.out.println("How much is " + first_num + " times " + second_num);
		break;
	case 3:
		System.out.println("How much is " + first_num + " minus " + second_num);
		break;
	case 4:
		System.out.println("How much is " + first_num + " divided by " + second_num);
		break;
	}
	readResponse(first_num, second_num);
}
public static void readResponse(int first_num, int second_num) {
	
	int ret = 0;
	switch(y) {
	case 1:
		 ret = first_num + second_num;
		break;
	case 2:
	     ret = first_num * second_num;
		break;
	case 3:
	     ret = first_num - second_num;
		break;
	case 4:
	     ret = first_num / second_num;
		break;
	}
	
	
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
		if ( z == 5) {
			y = 5;
		}
	quiz();
	}
}
public static void displayIncorrectResponse(int first_num, int second_num) {
	int incprrect_response = 1 + random.nextInt(4);
	switch(incprrect_response){
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
		if ( z == 5) {
			y = 5;
		}
	quiz();
	}
}
public static void displayCompletionMessage() {
int average = (correct*10);
System.out.println("Your score is "+average);
if (average > 75) {
   System.out.println("Congratulations, you are ready to go to the next level!");
}else if (average < 75) {
   System.out.println("Please ask your teacher for extra help.");
}
 System.out.println("Would you like to solve a new set of problems?(yes/no)");
 String nSet = scnr.next();
 int x = nSet.compareToIgnoreCase("yes");
 if (x == 0) {
	 a = 0;
	 count = 0;
	 correct = 0;
	 incorrect = 0;
	 y = 0;
	 z = 0;
	 n = 0;
	 quiz();
 }
return;
}



}




