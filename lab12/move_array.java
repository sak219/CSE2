import java.util.Scanner;
public class move_array{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like the size of the array to be?");
        int arraySize = scan.nextInt();
        int[] anArray;
        anArray = new int[arraySize];
        System.out.print("{ ");
        for(int i = 0; i<arraySize; i++){
            anArray[i] = (int)(Math.random()*100);
            System.out.print( anArray[i]+",");
        }
        System.out.println("}");
        System.out.println("Enter the index of the value to be moved.");
        int val = scan.nextInt();
        if(val<0 || val>anArray.length-1){
            System.out.println("That value is not in the acceptable range.");
            System.exit(-1);
        }
       for(int i = arraySize; i>0; i--){
            System.out.print( anArray[i]+",");
        }
        
        
        
    }
}