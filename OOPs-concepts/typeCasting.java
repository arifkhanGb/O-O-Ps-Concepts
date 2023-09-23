package infoMetics;

public class typeCasting {

	public static void main(String[] args) {
		int age=45;
		float marks=45.655f;
		marks=age; //widening casting
		age=(int)marks;//narrowing casting
		System.out.println(marks);
		System.out.println(age);
		
		
	}

}
