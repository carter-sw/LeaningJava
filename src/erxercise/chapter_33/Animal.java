package erxercise.chapter_33;

public class Animal {
    // 속성
    private String gender;

    //행위
    public void eat(String food){
        System.out.printf("동물이 %s 을 먹습니다\n",food);
    }
    public void sleep(){
        System.out.println("동물이 잠을 자고 있습니다.");
    }

}
