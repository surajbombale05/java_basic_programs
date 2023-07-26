import java.util.Scanner;

class Students {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];
        System.out.println("Enter ten students names:");
        

        for (int i = 0 ; i <10 ; i++){
            System.out.println("names:"+(i+1));
              arr[i] = sc.nextLine();
        }

        System.out.println("Names in capitals ");

        for (int i = 0 ; i<arr.length;i++){
             String a = arr[i].toUpperCase();   
            System.out.println(a);
        }
    }
}
