package infoMetics;
class out
{
	private int z=23;
	static class In
	{
		public static void show()
		{
			System.out.println("nested method of inner class");
		}
	}
}
class boss extends out
{
	public void showing(int  s)
	{
		System.out.println("fast");
	}
	
}
public class InharitNestedClass {
	
	public static void main(String [] a) {
	boss b1=new boss();
	b1.showing(1);
	
}
}
