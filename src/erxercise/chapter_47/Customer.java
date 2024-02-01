package erxercise.chapter_47;

import java.util.Objects;

public class Customer {
    //속성
    static int serialNums = 1;

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

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;
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

    @Override
    public String toString() {
        return String.format("Customer(customerId=%s, name=%s, customerGrade=%s, bounusPoint=%d\n)",
                this.customerID,this.name,this.customerGrade,this.bounsPoint);

    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==null){
            return false;
        }
        if(obj instanceof Customer){
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;

        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }
}
