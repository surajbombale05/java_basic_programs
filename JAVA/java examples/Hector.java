class Hector 
    {
    double landInAcre = 8;
    double hector = landInAcre *0.4046;
    double insurance;

    int inAmount()
        {
        System.out.println("land in hector:" + hector);
        if (hector < 10) {
            insurance = hector * 0.05 * 5000;
            System.out.println("insurance are " + insurance);
        } else {
            insurance = hector * 0.025 * 5000;
            System.out.println("insurance are " + insurance);
        }
        return 0;
    }

    public static void main(String args[]) {
        Hector insur = new Hector();
        insur.inAmount();
    }

}