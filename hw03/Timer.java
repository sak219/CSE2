//Sam Kiernan
//Professor Fouh
//CSE02
//hw03
//Timer Program
//Program Takes Military Time and Alerts How Much Time Is Left Until Dinner

import java.util.Scanner;
public class Timer{
    public static void main(String[] args){
        //Creating a Scanner object
        Scanner myScanner = new Scanner(System.in);
        //Prompting User For Current Time
        System.out.println("Enter the current time: ");
        int currentTime = myScanner.nextInt();
        //Prompting User For Dinner Time
        System.out.println("Enter the time that you will be eating dinner: ");
        int dinnerTime = myScanner.nextInt();
        
        //Calculating How Much Time Until Dinner
        int timeLeft = dinnerTime-currentTime;
        //Separating Hours and Minutes
        int hours = (int)(timeLeft/100);
        int minutes = timeLeft%100;
        
        //Printing Out The Results
        System.out.print("You have " + hours + " hours and ");
        System.out.println(minutes + " minutes until dinner.");
    }
}