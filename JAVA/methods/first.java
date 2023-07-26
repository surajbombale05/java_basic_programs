import java.util.Scanner;

class First{
     void add(int a , int b){
        int addition = a+b;
        System.out.println("addition is "+addition);
     }
     void sub(int a , int b){
        int subtraction = a-b;
        System.out.println("subtraction is "+subtraction);
     } 
     void multi(int a , int b){
        int multiplication = a*b;
        System.out.println("multiplication is "+multiplication);
     } 
     
     double div(int a , int b){
        double division = a/b;
        System.out.println("division is "+division);
        return 0;
     }   

    public static void main(String args[]){
        System.out.println("start calculations");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        First one = new First();
        one.add(first, second); 
        one.sub(first, second);
        one.multi(first, second);
        one.div(first, second);
    }
}