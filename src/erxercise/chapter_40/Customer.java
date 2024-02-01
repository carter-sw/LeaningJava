package erxercise.chapter_40;

public class Customer {
    //속성
    static int serialNums = 1;
    static {
        System.out.println("Customer 클래스가 로딩 됩니다.");
    }
    String hello1 ="Hello";
    String hello2 = "Hello2";

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
