import java.util.*;
public class Program03 
{
	public static void main(String args [])
	{
		int number1,number2;
		double num1,num2;
		double answer=0;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operands");
		number1=sc.nextInt();
		number2=sc.nextInt();
		num1=number1;
		num2=number2;
		System.out.println("\n");
		System.out.println("Enter the Operator(+,-,*,/,%)");
		operator=sc.next().charAt(0);
		switch(operator)
		{
			case '+' : answer=num1+num2;
				System.out.println("After Addition : "+answer);
				break;
			
			case '-' : answer =num1-num2;
				System.out.println("After Subtraction : "+answer);
				break;

			case '*' : answer=num1*num2;
				System.out.println("After Multiplication : "+answer);
				break;

			case '/' : answer=num1/num2;
				System.out.println("After Division : "+answer);
				break;

			case '%' : answer=num1%num2;
				System.out.println("After Modulo : "+answer);
				break;

			default: System.out.println("Enter Valid Operator");
			break;
		}
	}
}
