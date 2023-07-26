public class commandLine {
      void operations(int a ,int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
      }

    // int add(int a, int b) {
    //     return a + b;
    // }

    // int sub(int a, int b) {
    //     return a - b;
    // }

    // int multi(int a, int b) {
    //     return a * b;
    // }

    // int div(int a, int b) {
    //     return a / b;
    // }

    public static void main(String ac[]) {
        commandLine cm = new commandLine();
        String m = ac[0];
        String n = ac[1];
        int p = Integer.parseInt(m);
        int q = Integer.parseInt(n);
        cm.operations(p, q);
        // cm.add(p, q);
        // cm.sub(p, q);
        // cm.multi(p, q);
        // cm.div(p, q);

    }
}
