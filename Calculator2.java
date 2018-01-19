package com.assignmentsjavaoopadvance;

public abstract class Calculator2 implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private static double num;
	private static String operation;
	private static double result;
	private static char[] mathOps = {'+','-','*','/','%'};
	
	
	private static boolean isMathOp(String op) {
		for(int i=0; i<mathOps.length; i++) {
			if(op.charAt(0) == mathOps[i]) {
				return true;
			}
		}
		return false;
	}
	
    public static void clear() {
    		operation = ""; result = 0.0;
    	}
    
    public static void performOperation(String op) {
    	if(!isMathOp(op)) {
    		if(result == 0.0) {
    			 result = Double.parseDouble(op);
    		 }else {
    			num = Double.parseDouble(op);
    		       
    			 if(operation == "+") {
    				 result += num;
    			 }else if (operation == "-") {
    				 result -= num;
    			}else if(operation == "*") {
    				result *= num;
    			}else if (operation == "/") {
    				result /= num;
    			}else if(operation == "%") {
    			    result %= num;}
    		 }
  }else { 
     		operation = op;
        }
    }
    
	 public static double getResults() {
		 System.out.println(result);
		  return result;
	 }
	
}

