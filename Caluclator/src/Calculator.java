
public class Calculator {
	private double operAndOne;
	private String operation;
	private double operAndTwo;
	private double result;
		
	public Calculator() {
		
	}

	public Calculator(double operAndOne, String operation, double operAndTwo) {
		super();
		this.operAndOne = operAndOne;
		this.operation = operation;
		this.operAndTwo = operAndTwo;
		
	}

	public double getOperAndOne() {
		return operAndOne;
	}

	public void setOperAndOne(double operAndOne) {
		this.operAndOne = operAndOne;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getOperAndTwo() {
		return operAndTwo;
	}

	public void setOperAndTwo(double operAndTwo) {
		this.operAndTwo = operAndTwo;
	}
	
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public double performOperations() {
		if (operation == "-") {
			result = operAndOne - operAndTwo;
		}
		else if (operation == "+") {
			result = operAndOne + operAndTwo;	
		}
		return result;
		
		
	}
	

}

