package mission.week7.day5;

import java.util.List;
import java.util.ArrayList;

public class ThreeThreadsListFiller {
    public static void main(String[] args) {
        // 작업할 List 생성
        int listSize = 1000;
        List<Integer> list = new ArrayList<>(listSize); // ArrayList 생성자를 이용하여 초기 용량 지정
        for (int i = 0; i < listSize; i++) {
            list.add(0); // 초기 값으로 0을 설정
        }

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);

        // 3개의 쓰레드 생성, 업무 분담 실행
        Thread thread1 = new Thread(new ListFillerTask(list, 0));
        Thread thread2 = new Thread(new ListFillerTask(list, 1));
        Thread thread3 = new Thread(new ListFillerTask(list, 2));

        // 3개 Thread 작업 진행
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join(); // thread1이 종료될 때까지 대기
            thread2.join(); // thread2가 종료될 때까지 대기
            thread3.join(); // thread3이 종료될 때까지 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);
    }

    // 자신이 맡은 리스트 인덱스의 값을 각각 0, 1, 2로 채우도록 구현하는 Task 클래스
    static class ListFillerTask implements Runnable {
        private final List<Integer> list;
        private final int startIndex;

        public ListFillerTask(List<Integer> list, int startIndex) {
            this.list = list;
            this.startIndex = startIndex;
        }

        @Override
        public void run() {
            // 각 쓰레드는 자신이 맡은 인덱스를 0, 1, 2로 채움
            for (int i = startIndex; i < list.size(); i += 3) {
                list.set(i, startIndex);
            }
        }
    }
}
