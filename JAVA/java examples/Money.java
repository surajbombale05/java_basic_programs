public class Money {
   double landInHector;
   int seedForHalfAcre = 23;// 0.20*5
   double seedForOneHector = seedForHalfAcre * 5;
   float pricePerGram = 12.35f;

   double totalSeedForLand() {
      return seedForOneHector * landInHector;
   }

   double totalMoneyForSeed() {
      return seedForOneHector * landInHector * pricePerGram;
   }

   public static void main(String args[]) {

      Money suraj = new Money();
      suraj.landInHector = 10.15;
      suraj.totalSeedForLand();
      suraj.totalMoneyForSeed();
      System.out.println(suraj.totalSeedForLand() + " gram seeds are reqiured for your land");
      System.out.println(suraj.totalMoneyForSeed() + " rupees are required to buy seeds");
   }
}
