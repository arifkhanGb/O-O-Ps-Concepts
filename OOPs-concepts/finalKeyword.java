package infoMetics;

class Final
{
	public  final int c;//=90;//without initialize c is blank variable...(We Have Three Ways to Initialize final variable )
	
	//by instance initializer block
	{c=34;}
	
	/*By constructor
	Final()
	{this.c=45;}*/
	
	final static int y;// static blank final variable...can be initialize by only static init block.
	static
	{y=12;}
	public final void  f1()
	{
		System.out.println("final hu kisika baap bhi override nahi kar skta...");
	}
	
}
class B extends Final// cannt inharit final class
{
	public final void f1(int x)//final method cannt be Override  BUT We can Iharit final method...
	{
		System.out.println("tu override krke to dikha..");
	}
}
public class finalKeyword {

	public static void main(String[] args) {
//	Final f=new Final();
//	System.out.println("value of c ="+f.c);

		B obj = new B();
		obj.f1();
		obj.f1(1);
	}

}
