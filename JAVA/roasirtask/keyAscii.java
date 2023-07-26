class keyAscii {

    public static void main(String a[]) {
       String str = a[0];
       int len = str.length();
               
      for(int i = 0 ; i < len; i++){
        int e = (int) str.charAt(i);
         System.out.println(e);
     }
    }
}
