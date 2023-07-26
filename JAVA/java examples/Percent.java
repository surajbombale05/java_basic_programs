 class Percent 
 {
    int eng = 35 ;
    int marathi = 35 ;
    int math = 35 ;
    int phy = 35 ;
    int chem = 35 ;
    int bio = 35 ;
    int totalMarks =eng +marathi+math+phy+chem+bio;
    float percentage;

    
 
     int per()
     {
         percentage = totalMarks / 6 ;
         System.out.println("percentage are "+percentage);
         return 0;
     }


    public static void main(String args[])
    {
        System.out.println("this is main method");
        Percent per1 = new Percent();
        per1.per();
    }

 }
