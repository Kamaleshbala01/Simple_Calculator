package Simple_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Simple Calculator...!");
    	boolean flag = true;
    	while(flag) {
    		System.out.print("1 for addition\n2 for subtraction\n3 for multiplication \n4 for division\n5 for exit\n");
    		int choice = scanner.nextInt();
    		if(choice==5)break;
    		long number1,number2;
    		try {
    		System.out.print("Enter the first number :");
    		number1 = scanner.nextInt();
    		System.out.print("Enter the second number :");
    		number2 = scanner.nextInt();
    		switch(choice) {
    		case 1: Calculation.addNumber(number1,number2);
		    		System.out.print("Do you want to continue (yes/no) : ");
		    		scanner.nextLine();
					flag = scanner.nextLine().equals("yes");
    		        break;
    		case 2: Calculation.subNumber(number1,number2);
		    		System.out.print("Do you want to continue (yes/no) : ");
		    		scanner.nextLine();
		    		flag = scanner.nextLine().equals("yes");
	                break;
    		case 3: Calculation.multiNumber(number1,number2);
		    		System.out.print("Do you want to continue (yes/no) : ");
		    		scanner.nextLine();
					flag = scanner.nextLine().equals("yes");
	        		break; 
    		case 4: Calculation.divNumber(number1, number2);
		    		System.out.print("Do you want to continue (yes/no) : ");
		    		scanner.nextLine();
					flag = scanner.nextLine().equals("yes");
    				break;
    		case 5: flag = false;	
    		}
    		}catch(Exception e) {
    			System.out.println("Error : enter Decimal value only...!");
    			System.out.print("Do you want to continue (yes/no) : ");
    			scanner.nextLine();
    			flag = scanner.nextLine().equals("yes");
    		}
    	}
    	System.out.print("Thanks for using KB calculator...!");
    	scanner.close();
    }
}
