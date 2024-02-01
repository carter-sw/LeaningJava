package erxercise.chapter_32.fish;

public class seaSituation {
    public static void main(String[] args) {
//        FishChild fishChild = new FishChild();
//        fishChild.setSex("Male");
//        fishChild.setEatable(true);
//        fishChild.setLeavingSea("동해");
//
//        fishChild.printMyInfo();
//
//        FishChild fishChild2 = new FishChild("Female", true, "서해");
//        fishChild2.printMyInfo();

//        //자식 물고기 생성
//        FishChild fishChild = new FishChild();
//        fishChild.setLeavingSea("동해");
//        fishChild.setLeavingSeaChild("서해");
//
//        fishChild.printSea();

        //핵심 타입
        //타입선언 : 부모 인스턴스화 : 부모
        //타입선언 : 부모 인스턴스화 : 자식
        //타입선언 : 자식 인스턴스화 : 자식
        //타입선언 : 자식 인스턴스화 : 부모 => 묵시적 변환X

        Fish fish1 = new Fish();
        fish1.eat("새우");

        Fish fish2 = new FishChild();
        fish2.eat("새우");

        FishChild fish3 = new FishChild();
        fish3.eat("새우");


    }
}
