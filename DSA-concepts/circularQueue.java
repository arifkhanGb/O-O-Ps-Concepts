package basicJava;
import java.util.*;

class qu
{
	int a[];
	int size;
	int front;
	int rear;
	
	qu(int size)
	{
		a=new int [size];
		this.size=size;
		front=-1;
		rear=-1;
	}
	public void enque(int data)
	{
		if((front==0 && rear==size-1) || (rear==(front-1)%(size-1)))
		{
			System.out.println("queue is full");
			
		}
		else if(front==-1)// first element to push
		{
			front=rear=0;
			a[front]=data;
			return;
		}
		else if(rear==size-1 && front!=0)
		{
			rear=0;
			
		}
		else {
		rear++;
		
		}
		a[rear]=data;
		
	}
	public int  deque()
	{
		if(front==-1)
		{
			System.out.println("queue is empty!!");
			//return -1;
		}
	       int an=a[front];
	       a[front]=-1;
	       
	       
	       if(front == rear)
	       {
	    	   front=rear=-1;
	       }
	       
		else if(front==size-1) 
		{
			front=0;
		}
		else
		{
			
			front++;
			
		}
	       return an;
		
		
		
	}
	public void disp()
	{
		System.out.println("element in a queue");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class circularQueue {

	public static void main(String[] args) {
		
		qu q=new qu(5);
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		q.disp();
		System.out.println("delete element from the queue");
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println();
		System.out.println(q.front);
		q.disp();
		
	}

}
