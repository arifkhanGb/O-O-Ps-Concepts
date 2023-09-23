package infoMetics;

class initDemo1
{
	initDemo1()
	{
		System.out.println("default constructor");
	}
	initDemo1(int a)
	{
		System.out.println("param cons... having vlue="+a);
	}
	//instance initializer block(Anounymous Block)->every constuctor ki starting me chalega..
	{
		
		System.out.println("i am IIB(Anonamous block)");
	}
}
public class anonamousBlock {

	public static void main(String[] args) {
		
		initDemo1 d1=new initDemo1();
		initDemo1 d2=new initDemo1(12);
	}

}
