package erxercise.chapter_59;

import erxercise.chapter_57.Customer;
import java.util.List;

public class ListUtils {

    //add 기능 사용 시 누락의 위험이 있어서 따로 유틸클래스를 만들어서 사용
    // 두개의 스레드가 접근할 시 한 작업이 끝날때 까지 멈췄다가 실행 (synchronized,임계영역) 동기화 문제 해결

    public synchronized static void addList(List<Customer> customerList,Customer newCustomer){
        customerList.add(newCustomer);

    }
}
