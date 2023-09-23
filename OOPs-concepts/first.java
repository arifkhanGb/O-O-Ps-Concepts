package infoMetics;
import java.util.*;
	
class Que
{
	int a[];
	int rear;
	int size;
	
	Que(int size)
	{
		a=new int [size];
		this.size=size;
		
		rear=-1;
		
	}
	
	 void enq(int data)
	{
		 if(rear==size-1)
		 {
			 System.out.println("queeu is full");
			 return;
		 }
		 rear++;
		 a[rear]=data;
	}
	 int front;
	 public int Dqu()
	 {
		 
		 if(front==rear)
		 {
			 System.out.println("queue is Empty!!");
		 }
		 else
		 {
			 
			 front=a[0];
			
			 for(int i=0; i<rear;i++)
			 {
				 a[i]=a[i+1];
			 }
			 rear--;
			 
		 }
		 return front;
	 }
	 
	 public void show()
	 {
		 if(rear==-1)
		 {
			 System.out.println("quue is Empty");
			 return;
		 }
		 for(int i=0;i<size;i++)
		 {
			 System.out.println(a[i]);
		 }
	 }
}
class first
{

public static void main(String args[])
{
   Que obj=new Que(5);
   
   System.out.println("present element in a queue");
   obj.enq(1);
   obj.enq(2);
   obj.enq(3);
   obj.enq(4);
  obj.enq(5);
   
   
   obj.show();
   
   System.out.println("deleted element front the queue!!");
   
  
   System.out.println(obj.Dqu());
   System.out.println(obj.Dqu());
   System.out.println(obj.Dqu());
   System.out.println(obj.Dqu());
   System.out.println(obj.Dqu());
   System.out.println(obj.Dqu());
   
}
}

