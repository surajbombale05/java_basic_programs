class WordExist {

  String para;

  int countBca() {
    int len = para.length();
    String word = "bca";
    int count = 0;

    for (int i = 0; i < len; count++) {
      i = para.indexOf(word, i);
      if (i < len) {
        i += word.length();
      }
    }

    return count;
  }

  public static void main(String args[]) {
    WordExist w = new WordExist();
    w.para = "sagar is bca student and shubham is also bca student bca";
    int a = w.countBca();
    System.out.println("the total bca word is " + a);
  }
}
