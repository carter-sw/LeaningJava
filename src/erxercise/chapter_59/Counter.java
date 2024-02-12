package erxercise.chapter_59;

public class Counter {

    private int count=0; // 공통 접근 영역
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
