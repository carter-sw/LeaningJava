package erxercise.chapter_29;

// 시나리오 참고
// 1.'바리스타'는 '아메리카노' 주문 확인을 알린다.
// 2.'바리스타'는 물500mL와 원두 30g 로 '아메리카노 커피' 만든다.
// 3.'바리스타'는 '아메리카노 커피' 완성을 알린다.
public class Barista {

    // 속성

    //행위
    public void noticeOrder(String coffeeName){
        System.out.println("바리스타: 커피주문 확인했습니다."+coffeeName);
    }
    public Coffee makeUpCoffee(String coffeeName,long waterQuantity,long coffeBeenQuantity){
        Coffee coffee = new Coffee(coffeeName,waterQuantity,coffeBeenQuantity);
        return coffee;
    }

    public void sayCoffeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작이 완료되었습니다. 커피 :"+coffeeName);
    }
}
