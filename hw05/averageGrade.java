//Sam Kiernan
//Professor Fouh
//CSE02
//hw05
//averageGrade Program
//Program Prompts User For Numerous Grades, Which It Then Averages

import java.util.Scanner;
public class averageGrade {
	public static void main(String[] args) {
	    //Initial Prompt for Grade
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a grade between 0 and 100, or 999 to end.");
		//Variable for User Input
		double input = myScanner.nextDouble();
		//Variables to Count Within the Loop to Add Together and Count Number of Iterations
		double sum = 0.0;
		double count = 0.0;
		
		//Setting Up While Loop
		while (input <= 100 || input >= 0) {
		    //Adding each succesive input to itself
			sum += input;
			//Counting Iterations
			count++;
			//Stopping Loop at input of '999'
			if (input == 999) {
				break;
			}
			//Giving output for when desired input is not given
			else if(input < 0 || input > 100){
				System.out.println("That is not a valid number");
			}
			//Rerunning the loop and receiving another input from user
			System.out.println("Please enter a grade between 0 and 100, or 999 to end.");
			input = myScanner.nextDouble();
		}
		//Subtracting 999 from successive inputs to give correct sum
		double trueSum = sum-999;
		//Counting iterations aside from the last iteration (Using '999' to end loop)
		double trueCount = count-1.0;
		//Calculating and printing the average
		double average = trueSum/trueCount;
		System.out.println("The average of the grades entered is: " + average + "%");
	}
}