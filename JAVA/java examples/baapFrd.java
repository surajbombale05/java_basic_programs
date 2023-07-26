import java.util.Scanner;

public class baapFrd {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();

         if (name.equals("nikhil")) {
                System.out.println(name + " is flutter developer");
            } else if (name.equals("shubham")) {
                System.out.println(name + " is senior flutter developer ");
            } else if (name.equals("sagar")) {
                System.out.println(name + " is project manager ");
            } else if (name.equals("kushal")) {
                System.out.println(name + " is tallented person ");
            } else {
                System.out.println(name + " is not in our records! sorry");
            }
        }

    }
}
