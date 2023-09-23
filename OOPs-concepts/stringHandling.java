package infoMetics;


public class stringHandling {

	public static void main(String[] args) {
		
//		String x="Java";//string is immutable (cannot be changed)
//		x.concat("Rules");
//		System.out.println("x is ="+x);
//		x.toUpperCase();
//		System.out.println("Now still x is ="+x);
//		
//		StringBuffer obj=new StringBuffer("java");// this is mutable (it can be changed
//		obj.append("Rules");
//		System.out.println("Obj = "+obj);
//		
		String s=new String("Hello").intern();// Now s is having the referance of pool object.
		String s1="Hello";
		if(s==s1)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		

	}

}
