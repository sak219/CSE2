import java.util.Scanner;
//Sam Kiernan
//Professor Fouh
//CSE02
//hw06
//pyramid Program
//Program Prompts User For How Large They Want Their Pyramid To Be And Prints It
public class pyramid {
	public static void main(String[] args) {
		//Prompting User For Input of Size
		Scanner scan = new Scanner(System.in);
		System.out.println("What size pyramid?");
		//Storing Size
		int size = scan.nextInt();
		//Loop To Print Correct Spacing
	     for(int i = 0; i < size; i++) {
	         for(int p = 0; p < size-i; p++) {
	             System.out.print(" ");
	         }
	        //Loop To Print Stars Of Pyramid
	        for(int q = 0 ; q <= i; q++) {
	            System.out.print(" *");
	        }
	        System.out.println();  
	    }

	}
}