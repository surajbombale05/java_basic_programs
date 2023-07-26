 class table {
   
//      void tableTwo(int a){
//            for  (int i= 1 ;i<20 ;i=i+2 ){
//             System.out.println(i*a);
//            }
//      }
     table(int a){
      for  (int i= 1 ;i<20 ;i=i+2 ){
                 System.out.println(i*a);
              }
     }


    public static void main(String args[]){
       table t = new table(2);
          //t.tableTwo(2);
    }
}
