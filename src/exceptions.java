



public class exceptions{
	public static void calculator(int a,int b)
	{
		System.err.println(a/b);
		
	}
	public static void main(String[] args)
	{
		System.err.println("Welcome to Calculator");
		try {
			calculator(10,0);
		}
		catch (ArithmeticException e) {
			System.err.println("Invalid input provided");
			e.printStackTrace();
		}
	System.err.println("Thank You");
	
	}
}

