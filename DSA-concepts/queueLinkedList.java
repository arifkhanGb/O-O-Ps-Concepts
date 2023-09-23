package basicJava;
import java.util.*;

class QueLinked
{
	node front;
	node rear;
	class node
	{
		int data;
		node next;
		
		
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
		
		public void enqu(int data)
		{
			node n=new node(data);
			
			if(front==null )
			{
				 
			    front=rear=n;
					
			}
			if(front==rear)
			{
				rear=n;
				front.next=rear;
			}
			else
			{
				rear.next=n;
				rear=n;
				
			}	
		}
		public int dequ()
		{
		 int d ;
			if(front==null )
			{
			System.out.println("list is empty");
			
			
			}
			 if(front==rear)
			{
				 d=front.data;
				front=rear=null;
				
			}
			 else 
			 {
				d=front.data;
			front=front.next;
			 }
			return d;
			
			 
		}
		public void disp()
		{
			node temp=front;
			System.out.println("present node in the list");
			if(front==null)
			{
				System.out.println("list is empty!!");
				return;
			}
			if(front==rear)
			{
				System.out.println(temp.data+"<-");
				return;
			}
			else
			{
				while(temp!=null)
				{
					System.out.print(temp.data+"<-");
					temp=temp.next;
					
				}
			}
		}
		
	}
	
	

public class queueLinkedList {

	public static void main(String[] args) {
		QueLinked o=new QueLinked();
		o.enqu(1);
//		o.enqu(2);
//		o.enqu(3);
//  		o.enqu(4);
		o.disp();
		System.out.println();
		System.out.println("delete node from front!");
		System.out.println(o.dequ());
//		System.out.println(o.dequ());
//		System.out.println(o.dequ());
//		System.out.println(o.dequ());
		o.disp();
		
		
		


	}

}
