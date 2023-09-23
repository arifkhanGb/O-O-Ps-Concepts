package basicJava;
import java.util.*;
class cirqulerQ
{
	int arr[];
	int size;
	int front ;
	int rear;
	
	cirqulerQ(int size)
	{
		this.size=size;
		arr=new int [size];
		front=-1;
		rear=-1;
		
	}
	public boolean enq(int data)
	{
		if((front==0 && rear==size-1) || (rear==(front-1)%(size-1)))//check the condition for entering the data in a queue
		{
			System.out.println("queue is full");
		}
		else if(front==-1)
		{
			front =rear=0;
			
		}
		else if(rear==size-1 && front!=0)// for circuler queue
		{
			rear=0;
			
			
		}
		else
		{
			rear++;
			
		}
		arr[rear]=data;
		return true;
	}
	int deq()
	{
		if(front==-1)
		{
			System.out.println("queue is empty");
			return -1 ;
		}
		int a=arr[front];
		front=-1;
		if(front==rear)// single element present
		{
			front =rear=-1;
		}
		else if(front==size-1)
		{
			front=0;
		}
		else
		{
			front++;	
		}
		return a;
	
	}
	void dis()
	{
		if(rear==-1)
		{
			System.out.println("queue is empty");
			
		}
		else
		{
			for(int i=0;i<size;i++)
			{
				System.out.print(arr[i]);
			}
		}
	}
}
public class circulerQueue {

	public static void main(String[] args) {
		cirqulerQ q=new cirqulerQ(5);
		q.enq(1);
		q.enq(2);
		q.enq(3);
		q.enq(4);
		q.enq(5);
		q.deq();
		q.dis();
		 
//		 System.out.println("element delete in a queue");
//		System.out.println(q.deq());
//		q.dis();
//		System.out.println(q.deq());
		 
		

	}

}
