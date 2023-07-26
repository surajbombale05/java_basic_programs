class Stringshort{

    void arrayString(String s1, String s2,String s3,String s4,String s5){

      String arr[] = {s1,s2,s3,s4,s5};
      String temp;

      for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+"\t");
      }
         
      System.out.println("");

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0 ;j<arr.length-i-1;j++){
           if((int)arr[j].charAt(0)>(int)arr[j+1].charAt(0)){
             temp = arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
             
           }
         }
      }
       
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+"\t");
    }
    }

    public static void main(String a[]){
       String str1 = a[0];
       String str2 = a[1]; 
       String str3 = a[2];
       String str4 = a[3];
       String str5 = a[4];

       Stringshort s = new Stringshort();
       s.arrayString(str1,str2,str3,str4,str5);
    }
}