package infoMetics;
class outer
{
	private int x=12;
	static int y=20;
	public static void outerMethod()
	{
		System.out.println("outer class method call from inner class method");
	}
	static class Inner// inner class
	{
		public static void show()
		{
			
		System.out.println("value of y= "+y);
		
		outerMethod();
		}
	}
	
}
public class staticInnerClass {

	public static void main(String[] args) {
		//outer.Inner oi=new outer.Inner(); // object of static nested class outside the outer class
		
		outer.Inner.show();       // becoz inner class is static so no need to create object for calling static member.

	}

}
