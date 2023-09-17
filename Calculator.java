import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char op;
		Double n1, n2, res;
 
		System.out.println("+, -, *, or /");
		System.out.print("Choose an Operator :");
		op = input.next().charAt(0);
 
		System.out.print("Enter the Number 1 :");
		n1 = input.nextDouble();
		System.out.print("Enter the Number 2 :");
		n2 = input.nextDouble();
 
		switch(op)
		{
			case '+':
				res = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + res);
				break;
			case '-':
				res = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + res);
				break;
			case '*':
				res = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + res);
				break;
			case '/':
				res = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + res);
				break;
			default:
				System.out.println("Invalid Operator !");
				break;
		}
	}
}