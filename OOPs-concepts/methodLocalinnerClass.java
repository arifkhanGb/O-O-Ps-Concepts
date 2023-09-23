package infoMetics;

class outs
{
	int x=34;
	static int y=20;
	public void outermethod()
	{
		final int z=90;
		System.out.println("inside outer method");
		
		class inners
		{
			
		  void innermethod()
		  {
			  System.out.println(z);
			  System.out.println("inside inner class method");
			  System.out.println(x);
			  System.out.println(y);
		  }
		}
		
		inners i=new inners();
		i.innermethod();
	}
	
	
}
public class methodLocalinnerClass {

	public static void main(String[] args) {
		outs o=new outs();
		o.outermethod();

	}

}
