package infoMetics;

/*Constructor chaining is the process of calling one constructor from another constructor with respect to current object. 
One of the main use of constructor chaining is to avoid duplicate codes while having multiple constructor (by means of constructor overloading)
 and make code more readable.*/

class person
{
	String name;
	int age;
	int rollno;
	
	person()
	{
		this("constructor by Arif");// this KEYWORD USED FOR CONSTRUCTOR  IN SAME CLASS;
		System.out.println("constructor 1");
		name="arif";
		age=12;
		rollno=13;
		displya();
		
		
	}
	person(int a,int b)
	{
		System.out.println("constructor 2 ");
	   System.out.println(a+b);
	}
	person(String s)
	{
		this(12,23);
		System.out.println("constructor 3 "+s);
	}
	public void displya()
	{
	
		System.out.println("name of student"+"  "+name);
		System.out.println("age of student"+age);
		System.out.println("rollno of student"+rollno);
	}
}

public class constructor {

	public static void main(String[] args) {
		person s;
		s=new person();
	
		

	}

}
