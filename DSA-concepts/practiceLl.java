package basicJava;
import java.util.*;

class queue
{
	int q[];
	int front;
	int rear;
	int size;
	
	queue(int size)
	{
		q=new int [size];
		this.size=size;
		front=0;
		rear=0;
	}
	
	public void enqueue(int data)
	{
		if(rear==size)
		{
			System.out.println("queue is full");
			return;
		}
		
			
			q[rear]=data;
			rear++;
		
		
	}
	public int dequue()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
			return -1;
		}
		else
		{
			
			
			int ans=q[front];
			
			
			front++;
			
			
			if(front==rear)
			{
				front=0;
				rear=0;
			}
			return ans;
		}
			
	}
	public void peek()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
		}
		else {
			System.out.println(q[front]);
		}
			
	}
	public void disp() {
		
		for(int i=0;i<size;i++)
		{
			System.out.println(q[i]);
		}
	}
}

public class practiceLl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of queue");
		int s=sc.nextInt();
		 
		queue q=new queue(s);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
//		q.enqueue(4);
//		q.enqueue(5);
		
		
		 System.out.println("element in a queue!!");
		q.disp();
		
		System.out.println("deleted element from the queue");
		System.out.println(q.dequue());
		System.out.println(q.dequue());
//		System.out.println(q.dequue());
//		System.out.println(q.dequue());
//		System.out.println(q.dequue());
//		System.out.println(q.dequue());
		

		System.out.println("element on the top!!");
		q.peek();
		
		
		
		
		
	}
}
