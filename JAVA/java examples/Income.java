class Income
 {
    int totalMilk = 3000;
    double rateOfMilk =35.37 ;
    double monthlyIn;

    int totalIncome()
    {
        monthlyIn =totalMilk *rateOfMilk ;
        System.out.println("monthly income is "+monthlyIn);
        return 0;
    }

    public static void main(String args[])
    {
        Income income = new Income();
        income.totalIncome();
    }
}
