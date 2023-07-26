class Table {

    void tableTwo(int a){
          for  (int i= 1 ;i<20 ;i=i+a ){
           System.out.println(i*a);
          }
    }

   public static void main(String args[]){
      Table t = new Table(2);
       t.tableTwo(2);
   }
}