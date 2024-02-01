package erxercise.chapter_34;

public class GoldCustomer extends Customer{
    private double discountRatio;


    @Override
    public int calculatePrice(int price) {
        this.bounsPoint += price * bounsPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public GoldCustomer(String name){
        super();
        this.customerID ="Customer"+Customer.serialNums++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bounsPoint = 0;
        this.discountRatio = 0.03;
        this.bounsPointRatio = 0.03;
    }
}
