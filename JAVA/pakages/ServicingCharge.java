import java.util.Scanner;

class ServicingCharge{

    public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter service taxes:");
        int tax = s.nextInt();
 
         double  tenYearTax = tax * 10;
         System.out.println("ten year tax are: "+tenYearTax);
    }
}
