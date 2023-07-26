import java.util.Scanner;

class InputDemo {

    public static void main(String a[]){
        Scanner c = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int num1 = c.nextInt();

        System.out.println("please enter Second number: ");
        int num2 = c.nextInt();

        System.out.println("enter operation");
         String op = c.nextLine();
         
         if(op.equals("add")){
            System.out.println(num1+num2);
         }
        
         if(op.equals("sub")){
            System.out.println(num1-num2);
         }
         if(op.equals("mul")){
            System.out.println(num1*num2);
         }
         if(op.equals("div")){
            System.out.println(num1/num2);
         }
        

    }
}
