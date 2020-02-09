import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Calculator
{
	int add(int x, int y)
	{
		return x+y;
	}
	int sub(int x, int y)
	{
		return x-y;
	}
	int mult(int x, int y)
	{
		return x*y;
	}
	float div(int x, int y)
	{
		return x/y;
	}
	public static void main(String[] args) throws IOException
	{
		Calculator obj = new Calculator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		char c = (char) br.read();
		switch(c)
		{
			case '+':
				System.out.println(obj.add(a, b));
			break;
			case '-':
				System.out.println(obj.sub(a, b));
			break;
			case '*':
				System.out.println(obj.mult(a, b));
			break;
			case '/':
				System.out.println(obj.div(a, b));
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}
}