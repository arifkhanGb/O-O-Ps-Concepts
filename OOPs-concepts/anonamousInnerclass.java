package infoMetics;
import java.util.*;
class Parant
{
	void show()
	{
		System.out.println("show method from parant class");
	}
}
class subclass
{
		 Parant p=new Parant()// anonamous class 
		{
		  void show()
		  {
//			 super.show();// parent class method call
			  System.out.println("show method from sub class");
		  }
		};
}
public class anonamousInnerclass {

	public static void main(String[] args) {

	     subclass s=new subclass();
		s.p.show();

	}

}
