package infoMetics;

class calculation {
	public int sum(int a, int b) {
		
		return a+b;
	}
	
public double sum(int a, int b) {
		
		return a+b;
	}
}
public class Overloading {

	public static void main(String[] args) {
		
		calculation obj = new calculation();
		int result = obj.sum(10,20);
			System.out.println(result);

	}

}