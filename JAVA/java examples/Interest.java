public class Interest {

    public static void main(String args[]) {
        int principal = 1500000;
        int interestRate = 11;
        int timeInYear = 20;
        double interest = principal * interestRate * timeInYear / 100;
        double year = interest / timeInYear;
        System.out.println("total interest are " + interest);
        System.out.println("one year interest " + year);
    }
}
