package infoMetics;
class Testa
{
	interface t
	{
		void show();
	}
}
class testing implements Testa.t
{
	public void show()
	{
		System.out.println("Nested interface in java");
	}
}
public class InterfaceNested {

	public static void main(String[] args) {
		Testa.t obj;
		testing t1=new testing();
		//t1.show();
		obj=t1;// initialization of obj.
		obj.show();

	}

}
