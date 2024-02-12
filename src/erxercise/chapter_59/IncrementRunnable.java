package erxercise.chapter_59;

public class IncrementRunnable implements Runnable{

    private Counter counter;

    public IncrementRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for(int i = 0; i<1000; i++){

        // 인위적으로 스레드가 겹치는 상황 발생
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter.increment();
            System.out.println("Count: "+ counter.getCount());
        }
    }
}
