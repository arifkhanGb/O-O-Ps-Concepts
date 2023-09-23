package infoMetics;

class Aa
{
	int x=13;
	 public void sf()
	{
		System.out.println("lala");
	}
}
class Ba extends Aa
{
	 int x=12;//variable cannot be overriden
	 public void sf()
		{
			System.out.println("lala");
		}
}
public class overvar {

	public static void main(String[] args) {
		Aa ob=new Ba();
		ob.sf();
		System.out.println(ob.x);

	}

}
