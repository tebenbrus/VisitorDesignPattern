interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallTextOffer unli, boolean unliCallText);
}