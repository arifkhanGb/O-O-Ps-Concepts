package infoMetics;
//static block and static variables are executed in the order they are present in a program.
class SStdnt
{
	int rollno;
	String name;
	 static String cllgname;
	 static int counter=0;
	 
	 SStdnt(String name)
	 {
		 this.name=name;
	 this.rollno=setrollno();
	 }
	 
	 static int setrollno()
	 {
		 counter++;
		 return counter;
	 }	
	 static void setcllg(String name)
	 {
		 cllgname=name;
	 }
	 void getInfo()
	 {
		 System.out.println("student name="+this.name);
		 System.out.println("rollno name="+this.rollno);
		 System.out.println("cllgname name="+cllgname);
	 }
}
class Testtt
{
	static int a=m1();
	
	// static block
	static 
	{
		System.out.println("static block");
	}
	static int m1()// static function...
	{
		System.out.println("from m1");
		return 23;
	}
	
	
}
public class staticKeyword {

	public static void main(String[] args) {
		SStdnt.setcllg("rbs college");
		SStdnt s1=new SStdnt("arif");
		SStdnt s2=new SStdnt("arif khan");
		s1.getInfo();
		s2.getInfo();
//		System.out.println("Value of a : "+Testtt.a);
//	       System.out.println("from main");
		

	}

}
