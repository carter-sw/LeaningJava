package erxercise.chapter_13;

public class ImplicitCasting1 {
    public static void main(String[] args) {
        // 덜 정밀한 자료형 -> 더 정밀한 자료형
        int myInt = 5;
        float myFloat = myInt;

        // 사이즈가 작은 type -> 사이즈가 큰 타입
        int myIn = 10;
        long myLong = myIn;
        System.out.println(myLong);
    }
}
