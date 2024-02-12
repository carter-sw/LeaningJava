package mission.week7.day6;

public class SilverCustomer extends Customer {
    public SilverCustomer(String customerName, Long cache, String sneakerModel, boolean likeDelivery) {
        super(customerName, cache, sneakerModel, likeDelivery);
        this.customerLevel = CustomerLevel.SILVER;
    }
}