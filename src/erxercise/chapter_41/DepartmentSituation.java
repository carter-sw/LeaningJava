package erxercise.chapter_41;

public class DepartmentSituation {
    public static void main(String[] args) throws InterruptedException {
        // 전제 상황
        int price = 10000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer1 = new VIPCustomer("아이유");

        String hello ="Hello";
        String hello1 ="Hello";
        String hello2 ="Hello";
        String hello3 ="Hello";


        Customer[] customersQueue = {
                new Customer("권율"), new Customer("이순신"),new VIPCustomer("광해군"),
                customer1,new Customer("김좌진"),customer1,
                new Customer("장원영"),customer1,new VIPCustomer("김혜수"),
                new GoldCustomer("정우영"),new GoldCustomer("정우성"),new GoldCustomer("송혜교")
        };

        //시나리오
        for(Customer customer: customersQueue){
            customer.printMyInfo();
            int cash = staff.helpPayment(customer, price);
            System.out.printf("내가 내는 금액은 : %d \n",cash);
            staff.addSalesAmount(cash);
        }
        staff.printMySalesAmount();


        while(true){
            Thread.sleep(100);
        }
    }
}
