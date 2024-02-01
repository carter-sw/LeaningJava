package erxercise.chapter_18;

public class Day4_test {
    public static void main(String[] args) {

        int age =15;

        if(age >0 && age <12){
            System.out.println("전체 관람가");
        } else if (age == 0) {
            System.out.println("유아 관람불가");
        }else if(age >= 12 && age <=15){
            System.out.println("12세 이상 관람가");
        } else if(age >=15 && age <19){
            System.out.println("15세 이상 관람가");
        } else {
            System.out.println("청소년 관람불가");
        }
    }
}
