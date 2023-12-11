package calculator;
import java.util.Scanner;
public class calc {
	public static void main (String[] args) {
		int  n1, n2;
		char op;
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		n1=scan.nextInt();
		System.out.println("Enter the second number: ");
		n2=scan.nextInt();
		System.out.println("Choose Operator:");
		op=scan.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("addition of two integers: "+(n1+n2));
			break;
		case '-':
			System.out.println("subtraction of two numbers:"+ (n1-n2));
			break;
		case '*':
			System.out.println("Multiplication of two numbers:" +(n1*n2));
			break;
		case '/':
			System.out.println("Division of two numbers:"+(n1/n2));
			break;
		default:
			System.out.println("no operator found");
		
		}
		scan.close();
	}

}
