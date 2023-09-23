package infoMetics;

class Nesting
{
	int m, n;
	Nesting(int m, int n)
	{
		this.m=m;
		this.n=n;
	}
	int largest()
	{
		if(m>n)
		{
			return m;
		}
		else
			return n;
	}
	void dis()
	{
		int result=largest();// NESTING METHOD!!
		System.out.println(result);
	}
}
public class nestingMethod {

	public static void main(String[] args) {
		Nesting n=new Nesting(50,40);
		n.dis();

	}

}
