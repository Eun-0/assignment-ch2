public class DivideOperation extends AbstractOperation {
    @Override
    public double operate (int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("나눗셈 연산에서 분모(두 번째 피연산자)에 0이 입력될 수 없습니다!");
        } else {
            return (double) num1 / num2;
        }
    }
}
