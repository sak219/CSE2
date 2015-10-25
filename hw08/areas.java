import java.util.Scanner;
public class areas{
//Method to fin area of a circle given radius
public static double area(double radius){
	double area = Math.PI*(radius*radius);
	return area;
}
//Method to find area of rectangle given length and width
public static int area(int length, int width){
	return length*width;
}
//Method to find area of trapezoid given 2 bases and height
public static int area(int base1, int base2, int height){
	return ((base1 + base2)*height)/2;
}
	//The main method
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//Setting up a while loop
		int q = 1;
		int p = 1;
		while(q == p){
		    //Prompting user for what area they want
		System.out.println("Please enter \"1\" for circle, \"2\" for rectangle, or \"3\" for a trapezoid.");
		int tester = scan.nextInt();
		//Tester checks which one they desire
		if(tester == 1){
		    //Calling the first area method with parameter radius
			System.out.println("Please enter the radius.");
			int radi = scan.nextInt();
			double area1 = area(radi);
			System.out.println("The area is " + area1 + ".");
		}else if(tester == 2){
		    //Calling the second area method with parameters length and width
			System.out.println("Please enter the length and then width.");
			int len = scan.nextInt();
			int wid = scan.nextInt();
			int area2 = area(len, wid);
			System.out.println("The area is " + area2 + ".");
		}else if(tester == 3){
		    //Calling the third area method with parameters Base 1, Base 2, and height
			System.out.println("Please enter Base 1, followed by Base 2, followd by the height.");
			int b1 = scan.nextInt();
			int b2 = scan.nextInt();
			int ht = scan.nextInt();
			int area3 = area(b1, b2, ht);
			System.out.println("The area is " + area3 + ".");
		}
		//Asking user if they would like to continue finding areas
		System.out.println("Would you like to find the area of another shape? Enter 1 for Yes and 2 for No.");
		int answer = scan.nextInt();
		//2 is equivalent to saying no they don't want to continue
		if(answer == 2){
		    //Breaking out of while loop and ending the program since they entered 2
			break;
		}
		}
}
}