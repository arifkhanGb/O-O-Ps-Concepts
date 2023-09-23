package infoMetics;
class Patent
{
	void disp()
	{
		System.out.println("i provide black and white pic");
	}
}
class Child extends Patent
{
	public void horn()
	{
		System.out.println("Beep Beep");
	}
}
public class inharitanceSingle {

	public static void main(String[] args) {

		Child c=new Child();
		c.disp();
		c.horn();

	}

}
