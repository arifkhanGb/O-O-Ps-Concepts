package infoMetics;
class overDemo1
{
	
	public int sum(int a, int b)
	{
		int c=a+b;
		//System.out.println("sum is ="+c);
		return c;
	}
	void sum(float a, float b) 
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping\ta="+ a+"\t"+ "b="+b);
		
	}
}
public class polymorphism {

	public static void main(String[] args) {
		overDemo1 p=new overDemo1();
		int result=p.sum(12, 23);
		System.out.println(result);
		p.sum(12.5f, 5.5f);
		
		
	}

}
