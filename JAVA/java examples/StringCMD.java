   class StringCMD {
     
    public static void main(String ar[]){
        StringCMD ch = new StringCMD();
        String ab = ar[0];
        System.out.pritnln("simple string");
        
        System.out.println(ab);
        char[] charArray = ab.toCharArray();
        System.out.println("Reversed string:");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
            
    }
}
