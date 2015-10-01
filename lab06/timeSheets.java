import java.util.Scanner;

public class timeSheets{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer specifying the number of employee timesheets.");
        int timesheets = scan.nextInt();
        double totalPay = 0.0;
        double totalHours = 0.0;
        double pay1 = 0.0;

    for(int i=1; i<=timesheets; i++){
        while(timesheets>0){
            System.out.println("Please enter the payroll of Employee "+i+" in cents.");
            double cents = scan.nextDouble();
            System.out.println("Enter the number of hours this employee worked on Monday");
            double mon = scan.nextDouble();
            System.out.println("Enter the number of hours this employee worked on Tuesday");
            double tues = scan.nextDouble();
            System.out.println("Enter the number of hours this employee worked on Wednesday");
            double wed = scan.nextDouble();
            System.out.println("Enter the number of hours this employee worked on Thursday");
            double thurs = scan.nextDouble();
            System.out.println("Enter the number of hours this employee worked on Friday");
            double fri = scan.nextDouble();
            totalHours = (mon+tues+wed+thurs+fri);
            pay1 = totalHours*cents;
            break;
            }
        totalPay+=pay1;   
    }
    System.out.println("The total pay of all employees is $" + (totalPay/100) + ".");
    }
}