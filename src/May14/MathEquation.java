package May14;

public class MathEquation {
	private double operand1;
	private double operand2;
	private double result;
	private char operator;
	
	
	
	
	public double getOperand1() {
		return operand1;
	}
	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}
	public double getOperand2() {
		return operand2;
	}
	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	
	@Override
	public String toString() {
		return "MathEquation [operand1=" + operand1 + ", operand2=" + operand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}
	public MathEquation() {
		System.out.println("message-->no arg");
	}
	public MathEquation(char operator) {
		this.operator = operator;
	}
	//source--> generate constructor with fields
	public MathEquation(double operand1, double operand2, char operator) {
		//super();--->later we will learn
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}
	
	public void calculate() {
		switch(this.operator) {
		case '+':
			result = operand1 + operand2;
			break;
		case '-':
			result = operand1 - operand2;
			break;
		case '*':
			result = operand1 * operand2;
			break;
		case '/':
			result=operand1/operand2;
			break;
		default:
			System.out.println("invalid operator");
		}
	}


	
	/*Create a class called MathEquation
    add 4 private fields
        oprand1 , oprand2 , result as double
        operator as char

    Encapsulate first 3 fiels
        with getters and setters
        provide only setter for operator field

    Create no arg constructor
        just print out message from no Arg

    create 1 arg constructor
        set the operator value

    create 3 args constructor
        set all 3 fields value

    create a void instance method with no parameter
        set the result value
            according to oprand1 oprand2 operator
            if operator is + - * /
                calculate result

    Create toString method to return all fields value*/
}
