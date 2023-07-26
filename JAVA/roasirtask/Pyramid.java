
class Pyramid {

    void pyramidStar(){
        int n = 5;
       for (int a = 0 ; a < n ; a++){
         
          for (int b = n-a ; b > 1 ; b--){
             System.out.print(" ");
          }
           for (int b = 0 ; b<=a ;b++){
            System.out.print("* ");
           }
         

        System.out.println();
       }
    }



    public static void main(String args[]){
        Pyramid py = new Pyramid();
        py.pyramidStar();
    }
}
