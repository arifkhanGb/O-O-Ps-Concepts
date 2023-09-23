package infoMetics;
class sm
{
	public static void foo()
	{
		System.out.println("static method of sm class");
	}
	public void fool()
	{
		System.out.println("instance method of sm class");
	}
}
class smp extends sm
{
	public static void foo()// METHOD HIDING BY STATIC KEYWORD...
	{
		System.out.println("static method of smp class");
	}
	public void fool()
	{
		System.out.println("instance method of smp class");
	}
}

public class methodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sm h=new smp();
		h.foo();
		h.fool();

	}

}
