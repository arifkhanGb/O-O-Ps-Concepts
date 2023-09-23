package infoMetics;

class parents
{
	private int age;
	private String name;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void seName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
class subclass1 extends parents
{
	private int rollno;
	public void setrollno(int r)
	{
		rollno=r;
	}
	public int getrollno()
	{
		return rollno;
	}
	
}

public class inharetance {

	public static void main(String[] args) {
		subclass1 obj=new subclass1();
		obj.seName("Arif");
		obj.setAge(23);
		obj.setrollno(13);

		
		System.out.println("Name is ="+obj.getName());
		System.out.println("Name is ="+obj.getAge());
		System.out.println("Name is ="+obj.getrollno());




	}

}
