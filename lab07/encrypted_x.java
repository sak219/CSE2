import java.util.Scanner;

 public class encrypted_x{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100.");
        int input = scan.nextInt();
        if (input<0 || input>100){
            System.exit(-1);
        } 
        for(int i = 0; i < input; i++){
            for(int j = 0; j < input; j++){
            	if(j == input-i || j == i){
            		System.out.print(" ");
            	}else if(j != input-i || j != i){
            		System.out.print("*");
            	}
         
        }
            System.out.println("");            
     }
 }
 }