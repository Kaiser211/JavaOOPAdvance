package com.assignmentsjavaoopadvance;

public class Calculator1 implements java.io.Serializable {
		private double operandOne;
		private double operandTwo;
		private String operation;
		private double result;
		
		public Calculator1() {
			
		}
		
		public Calculator1 setOperandOne(double operand) {
			this.operandOne = operand;
			return this;
		}
		
		public Calculator1 setOperandTwo(double operand) {
			this.operandTwo = operand;
			return this;
		}
		public Calculator1 setOperation(String operation) {
			this.operation = operation;
			return this;
		}
		
		public Calculator1 performOperation() {
			if(operation == "plus" || operation == "+") {
				this.result = this.operandOne + this.operandTwo;
			}else if(operation == "minus" || operation == "-") {
				this.result = this.operandOne - this.operandTwo;	
			}
			return this;
		}
		public double getResults() {
			System.out.println(operandOne+" "+operation+" "+operandTwo+" = "+result);
			return result;
		} 

}
