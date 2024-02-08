package erxercise.chapter_58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001","이순신"));
        customers.add(new Customer("C002","아이유"));
        customers.add(new Customer("C002","아이유"));
        customers.add(new Customer("C001","이순신"));
        customers.add(new Customer("C003","카리나"));
        customers.add(new Customer("C001","이순신"));
        customers.add(new Customer("C003","카리나"));
        customers.add(new Customer("C004","윈터"));

        Customer myCustomer = new Customer("C001","이순신");
        // Q) myCustomer와 동일한 객체는 몇 개인지 출력하라.
        /* 기존 람다식
        long nums = customers.stream()
                .filter(customer -> customer.equals(myCustomer))
                .count();
        System.out.println("몇 개인지 "+nums);
         */
        long nums = customers.stream()
                .filter(myCustomer::equals)
                .count();
        System.out.println("몇 개인지 "+nums);


        // Q) customer의 각각의 bounsPoint를 얻어라
        /* 기존 람다식
        List<Integer> bounsPoints = customers.stream()
                .map(customer -> customer.getBounsPoint())
                .collect(Collectors.toList());
         */
        List<Integer> bounsPoints = customers.stream()
                .map(Customer::getBounsPoint)
                .collect(Collectors.toList());
        System.out.println("bounsPoints :" +bounsPoints);
    }
}
