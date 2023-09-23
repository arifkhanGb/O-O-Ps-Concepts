package infoMetics;

public class ExceptionHandeling {

	public static void main(String[] args) {
		
		try
		{
			int a=10/0;
//			int a=Integer.parseInt(args[0]);
//			int b=Integer.parseInt(args[1]);
//			int c=a/b;
//			System.out.println(c);
		}
		
		catch(ArithmeticException e)
		{
			System.err.println("do not divide by zero");
		}
		catch(NumberFormatException ea)
		{
		System.out.println("please enter only number");
		}
//		catch(Exception ae)
//		{
//			System.err.println("I provide solution for all");
//		}

	}

}
