package basicJava;
import java.util.*;

class Deque
{
	int arr[];
	int size;
	int front;
	int rear;
	Deque(int size)
	{
		arr=new int[size];
		this.size=size;
		front=-1;
		rear=-1;
				
	}
	public void pushfront(int data)
	{
		if(isFull())
		{
			System.out.println("queue is empty!!");
		}
		else if(isEmpty())
		{
			front=rear=0;
			//arr[rear]=data;
		}
		else if(front==0 && rear!=size-1 )
		{
			front=size-1;
		}
		
		else
		{
			front--;
		}
		arr[front]=data;
		
	}
	
	public void pushrear(int data)
	{
		if((front==-1 && rear==size-1) || (rear==(front-1)%(size-1) ) )
		{
			System.out.println("queue is empty!!");
		}
		else if(front==-1)
		{
			front=rear=0;
		}
		else if(rear==size-1 && front!=0)
		{
			rear=0;
		}
		else
		{
			rear++;
		}
		arr[rear]=data;
	}
	public int  popRear()
	{
		if(front==-1)
		{
			System.out.println("queue is empty");
		}
		int ans=arr[rear];
		arr[rear]=-1;
		
		if(front==rear)
		{
			front=rear=-1;
		}
		else if(rear==0)
		{
			rear=size-1;
		}
		else if(rear==0)
		{
			rear=size-1;
		}
		else
		{
			rear--;
		}
		return ans;
	}
	public int getFront()
	{
		if(isEmpty())
		{
			return -1;
		}
		return arr[front];
	}
	int getrear()
	{
		if(isEmpty())
		{
			return -1;
		}
		return arr[rear];
	}
	public boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		else
			return false;
	}
	public boolean isFull()
	{
		if((front==-1 && rear==size-1) || (front!=0 &&   rear==(front-1)%(size-1) ) )
		{
			return true;

		}
		else
			return false;
	}
	public void dis()
	
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}

public class doubleEndedQueue {
	public static void main(String []arge)
	{
		Deque d=new Deque(5);
		d.pushfront(1);
		 d.pushfront(2);
		d.pushfront(3);
//		d.pushfront(4);
//		d.pushfront(5);
		
		d.dis();
		
	}

}
