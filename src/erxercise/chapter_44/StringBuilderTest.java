package erxercise.chapter_44;

public class StringBuilderTest {
    public static void main(String[] args) {
        //+=
        String str = "";

        long startTime = System.currentTimeMillis(); // 스탑워치 시작

        for(int i=0; i<5000; i++){
            str += "Cat";

        }

        System.out.println(str);

        long endTime = System.currentTimeMillis();
        System.out.println("걸린 시간: "+ (endTime-startTime)+"ms");
//-------------------------------------------

        StringBuilder sb = new StringBuilder();

        long startTimesb = System.currentTimeMillis(); // 스탑워치 시작

        for(int i=0; i<5000; i++){
            sb.append("Cat");
        }
        String output = sb.toString();
        System.out.println(output);

        long endTimesb = System.currentTimeMillis();

        System.out.println("걸린 시간: "+ (endTimesb-startTimesb)+"ms/Sb");
    }

}
