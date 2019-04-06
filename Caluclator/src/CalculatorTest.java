
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator run = new Calculator();
		
		run.setOperAndOne(10.5);
		run.setOperation("+");
		run.setOperAndTwo(5.2);
		run.performOperations();
		run.getResult();
		System.out.println(run.getResult());
	}
}
