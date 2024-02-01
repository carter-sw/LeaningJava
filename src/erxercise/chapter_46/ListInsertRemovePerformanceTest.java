package erxercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {
    static final int Size = 1000000;
    public static void main(String[] args) {

        long startTime;
        long endTime;

        startTime= System.currentTimeMillis();
            // List ArrayList 구현
            List<Integer> integerList1 = new ArrayList<>();

            for(int i=0; i<Size; i++){
                integerList1.add(i);                                      // 삽입
                if(i % 5 ==0) integerList1.remove(0);                //삭제
            }

        endTime = System.currentTimeMillis();
        System.out.println("ArrayList 삽입/삭제 요청 걸린시간: "+(endTime-startTime)+"ms"); // ms= 1/1000 초

//        --------------------------------------------------------------

            // List LinkedList 구현
            List<Integer> integerList2 = new LinkedList<>();
        startTime= System.currentTimeMillis();
            for(int i=0; i<Size; i++){
                integerList2.add(i);
                if(i % 5 ==0) integerList2.remove(0);
            }
        endTime = System.currentTimeMillis();

        System.out.println("LinkedList 삽입/삭제 요청 걸린시간: "+(endTime-startTime)+"ms"); // ms= 1/1000 초

//            System.out.println("IntergerList1: "+integerList1);
//            System.out.println("IntergerList2: "+integerList2);
    }
}
