package erxercise.chapter_56;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력해주세요!");
        String name = sc.nextLine();

        System.out.println("직업을 입력해주세요!");
        String job = sc.nextLine();

        System.out.println("나이를 입력해주세요");
        int age = sc.nextInt();

        System.out.println("이름 :"+ name+" 직업 :"+job+" 나이 :"+age);
    }
}
