
public class AddEven {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        
        System.out.println("The sum of even numbers from 1 to 100 is: " + sum);
    }
}