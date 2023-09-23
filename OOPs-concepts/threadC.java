package infoMetics;
//BY IMPLEMENTING RUNNABLE INERFACE.....
class A implements Runnable
{
	public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println(i);
		System.out.print("Thread A= "+i);
	}
}
}
class B implements Runnable
{
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		
		System.out.print("Thread B= "+i);
	}
	}
}
public class threadC {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();
		

	}

}
