package basicJava;
import java.util.*;

class priorityQue
{
	
	int a[];
	int size;
	int front;
	int rear;
	priorityQue(int size)
	{
		a=new int[size];
		this.size=size;
		front=-1;
		rear=-1;
		
	}
	public void insert(int data)
	{
		int i;
		if(rear==size-1)
		{
			System.out.println("queue is full");
			
		}
		
		else if(front==rear)
		{
			rear++;
			a[rear]=data;
		}
		else 
		{
			for( i=0; i<=size;i++)
			{
				if(data>a[i])
				{
					a[i+1]=a[i];
				}
				else
					break;	
			}
			a[i]=data;
			
		}
		
	}
	
	
	
	
			
		  
		
}
public class priorityQueue {

	public static void main(String[] args) {
		
		
		
		

	}

}
