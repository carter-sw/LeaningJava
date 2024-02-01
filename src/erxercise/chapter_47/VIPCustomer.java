package erxercise.chapter_47;

import erxercise.chapter_43.Customer;

import java.util.Objects;

public class VIPCustomer extends Customer {
    static int serialNums = 1;


    // 속성
    private String agentID;
    private double discountRatio;

    //행위
    @Override
    public int calculatePrice(int price){
        this.bounsPoint +=price *bounsPointRatio;
        price -= price * discountRatio;
        return price;
    }
    public void callAgent(){
        System.out.println("담당직원"+this.agentID+"님 문의드릴게 있어요");
    }
    public VIPCustomer(String name){
        super();

        this.customerID="VIP"+serialNums++;
        this.name = name;
        this.customerGrade="VIP";
        this.bounsPoint = 0;
        this.bounsPointRatio = 0.05;
        this.discountRatio = 0.1;

    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    public void printMyInfo(){
        System.out.println("VIP");
        super.printMyInfo();
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
                "agentID='" + agentID + '\'' +
                ", discountRatio=" + discountRatio +
                ", customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }
}
