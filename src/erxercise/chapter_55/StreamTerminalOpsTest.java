package erxercise.chapter_55;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalOpsTest {
    public static void main(String[] args) {

        //List
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        // 1. forEach() : 출력
        fruits.stream().forEach( (fruit) -> System.out.println("for-each 출력:" + fruit) );

        // 2. collect : 다른 또는 같은 컬렉션 반환
        Set<String> fruitSet = fruits.stream().collect(Collectors.toSet());
        System.out.println("fruitSet: "+fruitSet);

        // 3. findFirst() : Stream의 첫번쨰 값 산출 Optional
        Optional <String> fruitOptional = fruits.stream().findFirst();
        System.out.println("optional fruit: "+fruitOptional.orElseGet(() ->"기본 과일"));

        // List Integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // 4.sum,average
        System.out.println("sum 값은" +integerList.stream().mapToInt((i)->i).sum());
        System.out.println("sum 값은" +integerList.stream().mapToInt((i)->i).average());

        // 5.count() , max() , min()
        System.out.println("Stream의 길이: " +integerList.stream().count());
        System.out.println("Stream의 가장 Max: "+ integerList.stream().mapToInt((i)->i).max());
        System.out.println("Stream의 가장 Min: "+ integerList.stream().mapToInt((i)->i).min());

        // 6.reduce() 로 소모 값 구하기
        int result = integerList.stream().reduce(0,(int1,int2)->int1+int2);
        System.out.println("reduce로 구한 값:"+result);
    }
}
