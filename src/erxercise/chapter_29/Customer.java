package erxercise.chapter_29;

// 시나리오 참고
// 1.'손님'은 '캐시어'에게 '아메리카노'가격 물어본다.
// 2.'손님'은 '자신의 현금'에서 돈을 뺸다.
// 3.'손님'은 '아메리카노'를 '테이크 아웃'로 주문한다.
// 4.'손님'은 '아메리카노 커피'를 마신다.
// 5.'손님'은 자신의 기분이 좋아진다.
public class Customer {
    //속성
    private long cachAmount;
    private String myFeeling;

    //행위
    public void askCoffee(Cashier cashier,String coffeeName){
        System.out.println("손님 : 커피"+coffeeName+" 얼마인가요?");
    }
    public long withDrawCash(long amount){
        this.cachAmount -= amount;
        return amount;
    }
    public void orderCoffee(String coffeeName,boolean isWrappedUp){
        System.out.println("손님: 커피"+coffeeName +"을 주문할게요"+"단 , 포장여부는 "+isWrappedUp+"으로 부탁드려요");
    }
    public void drinkCoffee(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님: 나는 커피"+coffeeName+"를 마신다");
    }
    public void upgradeMyFeeling(){
        this.myFeeling = "기분이 좋아졌다";
    }
    public void showMyInfo(){
        System.out.printf("손님 : 지금 나의 기분은 %s 합니다.,현금은 %d 있습니다,",this.myFeeling,this.cachAmount);
    }

    public void setCachAmount(long cachAmount) {
        this.cachAmount = cachAmount;
    }
}
