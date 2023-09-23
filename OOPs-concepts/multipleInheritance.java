package infoMetics;

interface M1
{
	int x=12;
	void add();
	void print();
}
interface M2
{
	int y=2;
	void sub();
	void print();
}
class calc implements M1,M2// multiple inharitance by interface
{
	int result;
	public void add()
	{
		result=x+y;
		System.out.println("result add is ="+result);
	}
	public void sub()
	{
		result=x-y;
		System.out.println("result sub is ="+result);
	}
	public void print()
	{
		System.out.println("hello");
	}
	public void multiply()
	{
		result=x*y;
		System.out.println("multiply is ="+result);
	}
}
public class multipleInheritance {

	public static void main(String[] args) {
		calc c=new calc();
		c.add();
		c.sub();
		c.multiply();
		
		c.print();

	}

}
