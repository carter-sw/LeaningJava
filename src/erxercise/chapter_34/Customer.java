package erxercise.chapter_34;

public class Customer {
    //속성
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bounsPoint;
    protected double bounsPointRatio;

    //행위
    public int calculatePrice(int price){
        this.bounsPoint+= price * bounsPointRatio;
        return price;
    }

    Customer(){

    }

    public Customer(String name){
        this.customerID="Customer"+serialNums++;
        this.name=name;
        this.customerGrade="SILVER";
        this.bounsPointRatio=0.01;
        this.bounsPoint =0;
    }

    public void printMyInfo(){
        System.out.printf("Customer(customerId=%s, name=%s, customerGrade=%s, bounusPoint=%d\n)",this.customerID,this.name,this.customerGrade,this.bounsPoint);
    }
}
