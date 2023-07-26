public class Grade {
    int eng = 66;
    int marathi = 45;
    int math = 77;
    int phy = 54;
    int bio = 55;
    int chem = 36;
    float percent = (eng + marathi + math + phy + bio + chem) / 6;

    void percent() {

        System.out.println("percentage are " + percent);

        if (percent < 35) {
            System.out.println("he is fail");
        } else if (percent >= 35 && percent < 60) {
            System.out.println("he has passed");
        } else if (percent >= 60 && percent < 100) {
            System.out.println("he is getting first class");
        } else {
            System.out.println("invalid");
        }
    }

    public static void main(String args[]) {
        Grade suraj = new Grade();
        suraj.percent();
    }
}
