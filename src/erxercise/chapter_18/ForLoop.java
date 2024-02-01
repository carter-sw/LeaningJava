package erxercise.chapter_18;

public class ForLoop {
    public static void main(String[] args) {
        // 1 ~ 10 다 더할건데 ,for-loop
        int sum = 0;

        for(int num=1; num <=10; num++){
            sum+= num;

        }
        System.out.printf("1~10까지 더한수는 %d 입니다",sum);
    }
}
