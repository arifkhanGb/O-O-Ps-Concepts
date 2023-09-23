package infoMetics;
interface Vehicle
{
	void changeGear(int x);
	void applyBreak(int y);
	void speed(int z);
	
}
class Bicycle implements Vehicle
{
	int gear;
	int speed;
	public void changeGear(int newGear)
	{
		gear=newGear;
		
	}
	public void speed(int s)
	{
		speed+=s;
	}
	public void applyBreak(int b)
	{
		speed=speed-b;
	}
	public void printstates()
	{
		System.out.println("speed"+speed+"gear"+gear);
	}
}
class Bike implements Vehicle
{
	int gear;
	int speed;
	public void changeGear(int newGear)
	{
		gear=newGear;
		
	}
	public void speed(int s)
	{
		speed+=s;
	}
	public void applyBreak(int b)
	{
		speed=speed-b;
	}
	public void printstates()
	{
		System.out.println("speed:\t " + speed + "gear:\t " + gear);
	}
}
public class Interface1 {

	public static void main(String[] args) {

		Bicycle b=new Bicycle();
		b.changeGear(3);
		b.speed(100);
		b.applyBreak(2);
		System.out.println("Bycicle states are");
		b.printstates();
		
		Bike b1=new Bike();
		b1.changeGear(12);
		b1.speed(90);
		b1.applyBreak(4);
		System.out.println("Bikes states are");
		b1.printstates();
		

	}

}
	