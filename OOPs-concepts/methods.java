package infoMetics;

class sum
{
	 private int l,b;
	int sum()
	{
		return (l*b);
	}
	
	int ractangle()
	{
	
		return l*b;
		//return r;
	}
	void setDimention(int x, int y)
	{
		l=x;
		b=y;
       		
	}
	void display()
	{
		System.out.println("length"+l);
		System.out.println("length"+b);
	}
	
	int  plus(int a, int b)
	{
		int result;
		result=a+b;
		return result;
	}
	
}
public class methods {

	public static void main(String[] args) {
	 sum s=new sum();
//	int total= s.plus(12,30);
//	System.out.println("sum is"+total);
	// s.l=9;//CTE
	 s.setDimention(12, 4);
	 System.out.println("dimention are=");
	 s.display();
	 System.out.println("area of ractangle is"+s.ractangle());
	 
	 

	}

}
