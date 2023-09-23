package infoMetics;

public class variable {
	
	String g;
	int age=12;
	static String name="arif";
	variable()
	{
		
		this.g="method";
	}
	public void student()
	{
		System.out.println(g);
	     System.out.println(age+"\n"+name);
	}
	public void paraMethod(int ag, String name)
	{
		age=ag;
		this.name=name;
		disp();
	}
	public void disp()
	{
		System.out.println("new age"+age);
		System.out.println("new name"+name);
		
	}

	public static void main(String[] args) {
		
     variable v=new variable();
     v.student();
     v.paraMethod(56, "gfg");
     
	}

}
