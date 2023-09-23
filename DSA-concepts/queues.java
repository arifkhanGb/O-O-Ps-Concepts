package basicJava;
import java.util.*;

class Queuey
{
	
static class queu
{
	static int a[];
	static int  rear=-1;
	static int size;
	
	queu(int size)
	{
		a=new int [size];
		this.size=size;
	}

	public static boolean isEmpty()
	{
		return rear==-1;
	}
	//add data in queue
	public static  void  add(int data)
	{
		if(rear==size-1)
		{
			System.out.println("queue is full");
			return;
		}
		rear++;
		a[rear]=data;
	}
	
	//dequeue
	public static int remove()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
		int front =a[0];
		for(int i=0;i<rear;i++)
		{
			a[i]=a[i+1];
			
		}
		rear--;
		return front;
	}
	public static int peek()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
		return a[0];
		
	}
}

	public static void main(String[] args) {
		queu q=new queu(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		//q.add(6);
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
		
		
		
	}
}


