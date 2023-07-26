public class decode {
    String decoder(char c) {
        if (c == '*') {
            return "A";
        } else if (c == '#') {
            return "B";
        } else if (c == '$') {
                return "C";
            }
        
        return null;
    }

    public static void main(String args[]) {
      decode de =  new decode();
      String output= de.decoder('*');
      System.out.println(output);

       output= de.decoder('#');
      System.out.println(output);

       output= de.decoder('$');
      System.out.println(output);
    
    }

}
