//import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
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
        setListResults(addResult(operateResult));

        return operateResult;
    }

    // 3. App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
    // 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
    public void setListResults(List<Double> list) {
        this.results = list;
    }

    // 3. App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
    // 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
    public List<Double> getListResults() {
        return this.results;
    }


    // 4. Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현
    public void removeFirstResult() {
        removeResult(0);
    }

    // 저장된 연산 결과 중 i번째 결과값을 삭제하는 메서드
    public void removeResult(int i) {
        if (this.results.size() == 0) {
            System.out.println("저장된 결과값이 없습니다!");
        } else {
            List<Double> temp = getListResults();
            temp.remove(i);
            setListResults(temp);
        }
    }

    // double형의 value 값을 추가하는 메서드
    public List<Double> addResult(double value) {
        List<Double> temp = getListResults();
        temp.add(value);
        return temp;
    }
}
