package infoMetics;
abstract class Abs
{
	abstract void  f1();
	public static  void fun()
	{
		System.out.println("func. in abstract class without abstract keyword..");
	}
	//we can create constructor in abstract class
	Abs()
	{
		System.out.println("abstract class constructor");
	}
	
}
class push extends Abs
{
      void f1()
	{
		System.out.println("abstract method implemented in subclass");
	}
}
public class abstractKeyword {

	public static void main(String[] args) {
		Abs p=new push();// cannt create object of abstract class but we can create reference variableof it.
		p.f1();
		Abs.fun();

	}

}
