package infoMetics;
interface parent
{
	void show();
}
class childs
{
	parent p1=new parent()
			{
				public void show()
				{
					System.out.println("I am in anonamous Inner Class class");
				}
			};
}
public class anonamousInnerclass1 {

	public static void main(String[] args) {
		childs c=new childs();
		c.p1.show();

	}

}
