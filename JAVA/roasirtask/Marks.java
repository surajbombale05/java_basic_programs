import java.util.Scanner;

class Marks {
        public static void main(String a[]) {

                Scanner sc = new Scanner(System.in);

                System.out.print("enter your name: ");
                String name = sc.nextLine();


                System.out.print("enter eng marks:");
                int eng = sc.nextInt();
                System.out.print("enter marathi marks:");
                int marathi = sc.nextInt();
                System.out.print("enter math marks:");
                int math = sc.nextInt();
                System.out.print("enter bio marks:");
                int bio = sc.nextInt();
                System.out.print("enter phy marks:");
                int phy = sc.nextInt();
                System.out.print("enter chem marks:");
                int chem = sc.nextInt();
                

                int totalMarks = eng + marathi + math + bio + phy + chem;
                System.out.println("total marks are:" + totalMarks);

                int percent = totalMarks / 6;
                System.out.println("percentage are:" + percent);

                if (percent > 60) {
                        System.out.println("passed in A grade");
                } else if (percent < 60 && percent > 35) {
                        System.out.println("passed in A grade");
                } else if (percent < 35) {
                        System.out.println("failed");
                } else {
                        System.out.println("error");
                }

        }

}