package Simple_Calculator;

public class Calculation {
    public static void addNumber(long num1,long num2) {
    	System.out.println("Result :"+(num1+num2));
    }
    public static void subNumber(long num1,long num2) {
    	System.out.println("Result :"+(num1-num2));
    }
    public static void multiNumber(long num1,long num2) {
    	System.out.println("Result :"+(num1*num2));
    }
    public static void divNumber(long num1,long num2) {
    	try {
    		System.out.println("Result :"+(num1/num2));
    	}catch(ArithmeticException e) {
    		System.out.println("Error : cannot divisable by zero(0)");
    	}
    }
}
