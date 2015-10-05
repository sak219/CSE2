import java.util.Scanner;
public class pyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What size pyramid?");
		int size = scan.nextInt();
	     for(int i = 0; i < size; i++) {
	         for(int p = 0; p < size-i; p++) {
	             System.out.print(" ");
	         }
	        for(int q = 0 ; q <= i; q++) {
	            System.out.print(" *");
	        }
	        System.out.println();  
	    }

	}
}