class Baap {

    void generatepattern(){
        String name = "Baap Company" ;
        int len = name.length();

        for(int a = 0 ; a <= len ; a++){
            for(int b = 0 ; b < a ;b++){
                System.out.print(name.charAt(b));
            }
            System.out.println();
        }
    }


    public static void main(String a[]){
         Baap b = new Baap();

         b.generatepattern();
    }
}