package infoMetics;

public class exceptionEx {

	public static void main(String[] args) {
		
		int balance=5000;
		int amount=6000;
		try {
		if(balance<amount)
			throw new ArithmeticException("insufisiant balance");
		balance=balance=amount;
		System.out.println("trancection complete");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("program continue");

	}

}
