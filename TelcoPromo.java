public class TelcoPromo {
  public static void main(String[] args) {
      Telco smart = new Telco(15, 500, "Smart", false);
      Telco globe = new Telco(10, 450, "Globe", false);
      Telco ditto = new Telco(8, 400, "Ditto", true);

      TelcoAllowance allowance = new TelcoAllowance();
      UnliCallTextPackage unliPackage = new UnliCallTextPackage();

      System.out.println("\nSmart Data Usage Offer and price: " + allowance.showAllowance("Smart", 500));
      System.out.println("Globe Data Usage Offer and price: " + allowance.showAllowance("Globe", 450));
      System.out.println("Ditto Data Usage Offer and price: " + allowance.showAllowance("Ditto", 400));

      System.out.println("\nSmart Call and Text Offer: " + unliPackage.showUnliCallsTextOffer("Smart", false));
      System.out.println("Globe Call and Text Offer: " + unliPackage.showUnliCallsTextOffer("Globe", false));
      System.out.println("Ditto Call and Text Offer: " + unliPackage.showUnliCallsTextOffer("Ditto", true));
  }
}