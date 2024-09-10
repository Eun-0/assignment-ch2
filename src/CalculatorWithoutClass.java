import java.util.Scanner;

public class CalculatorWithoutClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 4. 반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기
        while (true) {
            // 1. 두 개의 피연산자(0 이상의 양의 정수) 입력받기
            // 입력받은 양의 정수는 적합한 타입으로 선언한 변수에 저장
            System.out.print("첫 번째 피연산자를 입력하세요.(단, 0 이상의 양의 정수만 가능): ");
            int num1 = sc.nextInt();
            while (num1 < 0) {
                System.out.println("음수가 입력되었습니다.");
                System.out.print("다시 입력하세요.: ");
                num1 = sc.nextInt();
            }
//            if (num1 < 0) {
//                System.out.println("음수가 입력되었습니다.");
//                System.out.println("시스템을 종료합니다.");
//                return;
//            }
            System.out.print("두 번째 피연산자를 입력하세요.(단, 0 이상의 양의 정수만 가능): ");
            int num2 = sc.nextInt();
            while (num2 < 0) {
                System.out.println("음수가 입력되었습니다.");
                System.out.print("다시 입력하세요.: ");
                num2 = sc.nextInt();
            }
//            if (num2 < 0) {
//                System.out.println("음수가 입력되었습니다.");
//                System.out.println("시스템을 종료합니다.");
//                return;
//            }

            // 2. 사칙연산 기호(+, -, *, /) 입력받기
            // 입력받은 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장
            System.out.print("연산자를 입력하세요.(덧셈: +, 뺄셈: -, 곱셈: *, 나눗셈: /): ");
            char operator = sc.next().charAt(0);

            // 3. 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
            double result = 0;

            switch (operator) {
                case '+':   // 덧셈 연산
                    result = num1 + num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                    break;
                case '-':   // 뺄셈 연산
                    result = num1 - num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                    break;
                case '*':   // 곱셈 연산
                    result = num1 * num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                    break;
                case '/':   // 나눗셈 연산
                    if (num2 == 0) {    // 나눗셈 연산 오류
                        System.out.println("나눗셈 연산에서 분모(두 번째 피연산자)에 0이 입력될 수 없습니다.");
                    } else {
                        result = (double) num1 / num2;
                        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                    }
                    break;
                default:                // 연산자 입력 오류
                    System.out.println("유효하지 않은 연산자입니다.");
            }

            System.out.println("연산을 계속 진행하시겠습니까? ('exit' 입력 시 종료)");
            if (sc.next().equals("exit")) {
                return;
            }
        }
    }
}
