//Sam Kiernan
//Professor Fouh
//September 17, 2015
//CSE02
//Lab04
//Calculator.java



//Calculator program that prompts user for 2 integers and an operator
//Computes the desired operation between the 2 integers
//Displays "Illegal Operator" if operator is invalid
public class Calculator{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        //Prompting the user for Integers 'a' and 'b'
        System.out.println("What would you like your first integer to be?");
        int a = myScanner.nextInt();
        System.out.println("What would you like your second integer to be?");
        int b = myScanner.nextInt();
        //Prompting user for the desired operator
        System.out.println("What would you like your operator to be? (Must be '+', '-', '*', or '/'");
        String operator = myScanner.next();
        //Using a Switch statement to perform the operation between integers 'a' and 'b'
        switch(operator){
            case "+":
            System.out.println("The result is "+ (a+b));
            break;
            case "-":
            System.out.println("The result is "+ (a-b));
            break;
            case "*":
            System.out.println("The result is "+ (a*b));
            break;
            case "/":
            System.out.println("The result is "+ (a/b));
            break;
            //Saying Illegal Operator when operator given is not expected
            default:
            System.out.println("Illegal operator.");
            break;
        }
        
    }
}