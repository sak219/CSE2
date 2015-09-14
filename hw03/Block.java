//Sam Kiernan
//Professor Fouh
//CSE02
//hw03
//Block Program
//Program Prompts User For Length,Width,Height, and Returns Surface Area and Volume

import java.util.Scanner;
public class Block {
	public static void main(String[] args){
		//Creating a Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        //Prompting User For The Sides Of The Block
        //Prompting User For Length
        System.out.println("Enter the length: ");
        double length = myScanner.nextDouble();
        //Prompting User For Width
        System.out.println("Enter the width: ");
        double width = myScanner.nextDouble();
        //Prompting User For Height
        System.out.println("Enter the height: ");
        double height = myScanner.nextDouble();
        
        //Calculating Volume Of The Block
        double volume = length*width*height;
        //Printing Volume
        System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+ volume);
        
        //Calculating the Surface Area Of The Block
        double surfaceArea = 2*((length*width)+(height*length)+(height*width));
        //Printing Surface Area
        System.out.println("The surface area of the block is "+surfaceArea + ".");
	}

}