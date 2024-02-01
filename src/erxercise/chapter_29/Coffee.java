package erxercise.chapter_29;

// 시나리오 참고
// -'아메리카노 커피'는 물 500ml와 원두 30g으로 만들어진다.
// -'아메리카노 커피'는 '테이크 아웃용'으로 포장된다.
public class Coffee {
    //속성
    private String coffeeName;
    private long waterQuantity;  // ml단위
    private long coffeBeenQuantity; // 원두의 양 g 단위
    private boolean isWrappedUp;    //포장 됨 여부

    //행위
    void beWrappedUp(){
        this.isWrappedUp = true;
    }

    //생성자
    public Coffee(String coffeeName, long waterQuantity, long coffeBeenQuantity) {
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeBeenQuantity = coffeBeenQuantity;
        isWrappedUp = false;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }
}
