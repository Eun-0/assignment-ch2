//import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 1. 연산 결과를 저장하는 컬렉션 타입 필드
//    Collection<Double> result;
    private List<Double> results;

    // Constructor
    public Calculator() {
        this.results = new ArrayList<Double>();
    }

    // 1. 사칙연산을 수행 후, 결과값 반환 메서드 구현
    public double calculate(int num1, int num2, char operator) {
        AbstractOperation operation = switch (operator) {
            case '+' -> new AddOperation();
            case '-' -> new SubtractOperation();
            case '*' -> new MultiplyOperation();
            case '/' -> new DivideOperation();
            default -> throw new IllegalArgumentException("유효하지 않은 연산자입니다!");
        };

        double operateResult = operation.operate(num1, num2);
        setResult(operateResult);

        return operateResult;
    }

    // 3. App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
    // 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
    public void setResult(double value) {
        this.results.add(value);
    }

    // 3. App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
    // 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
    public double getResult() {
        if (this.results.size() == 0) {  // result.isEmpty()
            System.out.println("Nothing to do");
            return 0;
        } else {
            return this.results.get(this.results.size() - 1);
        }
    }
}
