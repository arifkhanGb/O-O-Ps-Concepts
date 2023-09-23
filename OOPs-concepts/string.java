
package infoMetics;

class student
{
	static String name;
	 static int age;
	  
	 public void abd(int a)
	 {
		 System.out.println(a);
	 }
	 public void abd(int a,int v)
	 {
		 System.out.println(a+v);
	 }
	 static void accept(String n, int a)
	 {
		 name=n;
		 age=a;
		 
	 }
	 int  accept()
	 {
		 
		 System.out.println("default method call");
		 int a=45;
		 return a;
	 }
	 void display()
	 {
		 System.out.println("name is="+name);
		 System.out.println("age is="+age);
	 }
	 
}
public class string
{
	 public static void main(String[] args)
	 {
		 student s=new student();
		 student.accept("Arif", 12);
		s.display();
		int r=s.accept();
		System.out.println("returning values="+r);
		
		s.abd(1);
		s.abd(1,3);
		
		
		 
	 }
}







