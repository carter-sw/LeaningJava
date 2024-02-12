package mission.week7.week7day1;

public class InvalidOperatorException extends RuntimeException{
    public InvalidOperatorException(String message) {

        super(message);
        System.out.println("유효하지 않은 연산자가 입력된 경우 발생하는 예외입니다.");
    }
}
