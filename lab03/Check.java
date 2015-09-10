//Sam Kiernan
//Professor Fouh
//CSE002
//September 10, 2015
//Program Designed To Take Input In Order To Split Check And Add Desired Tip
import java.util.Scanner;

//Class
public class Check{
    //Main Statement
    public static void main(String[] args){
        //Initial Scanner
        Scanner myScanner = new Scanner(System.in);
        //Asking For Original Check Price
        System.out.print("Enter the original cost of the check in the form XX.XX ");
        //Accepting User Input
        double checkCost = myScanner.nextDouble();
        //Prompting User For Desired Tip Percentage
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (In the form XX) : ");
        double tipPercent = myScanner.nextDouble();
        //Making Tip Percent In To A Decimal Value
        tipPercent /= 100;
        //Prompting User For How Many Will Be Splitting Check
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        //Main Piece Of Code
        //Calculating Values and Printing Out The Correct Values
        double totalCost;
        double costPerPerson;
        //Dollar Amount Of Cost, Takes In Decimal Values As Well
        int dollars, dimes, pennies;
        totalCost = checkCost*(1+tipPercent);
        costPerPerson = totalCost / numPeople;
        //Obtains Whole Amount, Dropping The Decimal Through Casting
        dollars = (int)costPerPerson;
        //Obtaining Values To The Right Of Decimal
        dimes = (int)(costPerPerson*10)%10;
        pennies = (int)(costPerPerson*100)%10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes +  pennies);
        
    }
}