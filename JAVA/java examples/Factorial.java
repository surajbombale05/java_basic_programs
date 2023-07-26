 import java.util.Scanner;

public class Factorial {
    void fact(int a){
        int b= 1; 
        for (int i = 1 ; i <=a ; i++){
            b= b*i;
        }
        System.out.println("Factorial are "+b);
    }
 public static void main(String args[]){
    System.out.print("enter a number to calculate a factorial:");
    Factorial f = new Factorial();

     Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
    
     f.fact(a);
  }

}
