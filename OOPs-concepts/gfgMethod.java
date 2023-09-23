package infoMetics;

class Test
{
	public static int i=0;
	
	Test()
	{
		i++;
	}
	public static int get()
	{
		return i;
	}
	
	public int  m1()
	{
		System.out.println("m1 method is calling m2");
		m2();
		
		return 1;
		
	}
	public void m2()
	{
		System.out.println("inside the method m2");
	}
}
public class gfgMethod {

	public static void main(String[] args) {
		
		Test t=new Test();
		int i=t.m1();
		System.out.println("control return after method m1\t"+i);
		
		int no_of_object=Test.get();
		System.out.println("no of instance created till now");
		System.out.println(no_of_object);
		
	}

}
