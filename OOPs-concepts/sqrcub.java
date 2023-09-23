package infoMetics;
//EXTENDS Thread Class..
class sqr extends Thread
{
	public void run()
	{
	int f=5;
	System.out.println(f*f);
	}
	
}
class cube extends Thread
{
	public void run()
	{
	int f=5;
	System.out.println(f*f*f);
	}
	
}
public class sqrcub {

	public static void main(String[] args) {
		sqr s=new sqr();
		cube c=new cube();
		s.start();
		c.start();

	}

}
