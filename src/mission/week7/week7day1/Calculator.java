package mission.week7.week7day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        char operator = ' ';
        Scanner sc = new Scanner(System.in);

        try {
            // 숫자1 입력
            System.out.println("num1 입력:");
            num1 = sc.nextInt();
            // 숫자2 입력
            System.out.println("num2 입력:");
            num2 = sc.nextInt();
            // 연산자 입력
            System.out.println("연산자 입력 (+,-,*,/)");
            operator = sc.next().charAt(0);
            // calculate 메소드 호출
            calculate(num1, num2, operator);
            int result = calculate(num1,num2,operator);
            // 결과 출력
            System.out.println("결과: "+result);

        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
            sc.close();
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
            sc.close();
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
            sc.close();
        }
    }

    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        // 사칙연산 수행 및 예외 처리

        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    // 나누기 연산에서 0으로 나누는 경우 DivideByZeroException을 던집니다.
                    throw new DivideByZeroException("0으로 나눌 수 없습니다.");
                }
                return num1 / num2;
            default:
                // 지원하지 않는 연산자인 경우 InvalidOperatorException을 던집니다.
                throw new InvalidOperatorException("유효하지 않은 연산자입니다. " + operator);
        }
    }
}


