public class Interest{
    public static void main(String[] args){
        double acctBal;
        double intRate;
        intRate = 1.01;
        acctBal = 10000;
        int myIntRate = (int) intRate;
        double medium = myIntRate * acctBal;
        double acctNew = acctBal + medium;
        System.out.println(acctNew);
        
        
    }
}