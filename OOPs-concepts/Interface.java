package infoMetics;
interface In1
{
	public static final int c=12;
	void sum(int x , int y);
	 static void display()//we can define static method in interface (in jdk 8)
	    {
	        System.out.println("hello");
	    }
	 default void gun()//we can define default method in interface (in jdk 8)
	 {
		 System.out.println("default implementation of interface having no effect the intention behind the interface!");
	 }
}
class Inter implements In1
{
	public void sum(int x, int y)
	{
		System.out.println(x+y);
		
	}
}
public class Interface {

	public static void main(String[] args) {
		Inter i=new Inter();
		i.sum(1, 2);
		System.out.println("variable of interface="+In1.c);
		In1.display();//we can define static method , will not inherited...
		i.gun();// we can call default method without object of interface.

	}

}
