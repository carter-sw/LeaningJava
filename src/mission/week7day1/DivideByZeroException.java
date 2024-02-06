package mission.week7day1;

public class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String message) {

        super(message);
        System.out.println("숫자2가 0인 경우 발생하는 예외입니다.");
    }
}
