package infoMetics;
interface I1
{
	public void geek();
}
interface I2
{
	public void For();
}
interface I3 extends I1,I2
{
	public void geek();
}
class multichild implements I3
{
	public void geek()
	{
		System.out.println("Geek");
	}
	public void For()
	{
		System.out.println("For");
	}
}
public class multinharitance {

	public static void main(String[] args) {
		multichild m=new multichild();
		m.geek();
		m.For();
		m.geek();

	}

}
