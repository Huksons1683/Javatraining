package demo;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		
		int num1 , num2, result;
		char operator;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, /");
		operator = in.next().charAt(0);
		
		System.out.println("Enter first number");
	    num1 = in.nextInt();
	    
	    System.out.println("Enter Second number");
	    num2 = in.nextInt();
	    
	    switch(operator) {
	    case '+':
	    	result = num1 + num2;
	    	System.out.println(result);
	    	break;
	    case '-':
	    	result = num1 - num2;
	    	System.out.println(result);
	    	break;
	    case '/':
	    	result = num1 / num2;
	    	System.out.println(result);
	    	break;
	    
	    case '*':
	    	result = num1 * num2;
	    	System.out.println(result);
	    	break;	
	    
	    default:
	    	System.out.println("Invalid operator");
	    	break;
	    }
	    
	}
}
	
