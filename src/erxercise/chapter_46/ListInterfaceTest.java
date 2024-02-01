package erxercise.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        // List 정의
        List<String> fruitList = new ArrayList<>();

        // add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Bananan");
        fruitList.add("Kiwi");

        System.out.println("fruitList 요소:"+fruitList); // 넣은 순서대로 출력

        // add(index,element)
        fruitList.add(3,"Mango");

        System.out.println("fruitList 요소:"+fruitList);

        // remove(index)
        fruitList.remove(3);
        System.out.println("fruitList 요소:"+fruitList);

        //get (Index)
        String myFruit = fruitList.get(3);
        System.out.println("가져온 과일은: "+myFruit);

        //set(Index,Element)
        fruitList.set(1,"PineApple");
        System.out.println("fruitList 요소:"+fruitList);

        // size
        System.out.println("리스트 사이즈: "+ fruitList.size());

        //isEmpty :현재 리스트가 비어있는지 ,안비웠는지 확인
        List<String> fruitList2 = new ArrayList<>();

        System.out.println(fruitList2.isEmpty());
        System.out.println(fruitList.isEmpty());

        // Contains : 리스트에 해당 원소가 있는지 없는지 확인하는 메서드
        System.out.println(fruitList.contains("Kiwi"));
        System.out.println(fruitList.contains("Apple"));

        // IndexOf, Clear
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2)); //찾는 대상이 있으면 0
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3)); // 찾는 대상이 없으면 -1

        fruitList.clear();
        System.out.println("fruitList 요소:"+fruitList);
    }
}
