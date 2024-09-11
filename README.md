# [Assignment][Ch2] 계산기
- 클래스를 사용하지 않은 계산기 (절차지향 프로그래밍)
- 클래스를 사용한 계산기 (객체지향 프로그래밍)

<br>

## 1. 요구사항 분석 및 정의 & 설계
<https://1step2dream.tistory.com/8>

## 2. 구현
### 1) 클래스를 활용하지 않은 계산기
<https://1step2dream.tistory.com/10>
#### • CalculatorWithoutClass 클래스
- 절차 지향적 설계

<br>

### 2) 클래스를 활용한 계산기
<https://1step2dream.tistory.com/11>

![클래스 다이어그램](https://github.com/Eun-0/assignment-ch2/blob/myBranch/CalculatorClassDiagram2.png)

---

#### Calculator 클래스
- 객체 지향적 설계

#### AbstractOperation 클래스
- 연산 기능 담당 추상 클래스

#### AddOperation 클래스
- 덧셈 연산 담당 클래스

#### SubtractOperation 클래스
- 뺄셈 연산 담당 클래스

#### MultiplyOperation 클래스
- 곱셈 연산 담당 클래스

#### DivideOperation 클래스
- 나눗셈 연산 담당 클래스

#### App 클래스
- CalculatorWithoutClass 클래스를 기반으로 생성된 클래스
- 계산기의 전체적인 입출력 및 기능 구현 확인
- main 메서드 포함