package basicJava;
import java.util.*;
class cll
{
	
	node tail=null;
	class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data=data; 
			this.next=null;
		}
	}
		void insertAtb(int data)
		{
			
			node n=new node(data);
			if(tail==null)
			{
			tail=n;
			n.next=tail;
			return;
			
			}
			
			{
				
				n.next=tail.next;
				tail.next=n;
				tail=n;
				
				
			}
			
				
			
		}
		
		void intsertAtPosition(int element, int data)
		{
			node n=new node(data);
			node temp=tail;
			while(temp.data!=element)
				
			{
				temp=temp.next;
			}
 			n.next=temp.next;
			temp.next=n;
			
		}
		void insertAtend(int data)
		{
			node n=new node(data);
//			node temp;
//			temp=tail;
//			n.next=temp.next;
//			temp.next=n;
//			tail=n;
			n.next=tail.next;
			tail.next=n;
			tail=n;
		}
		
		void deleteAtend()
		{
			node temp=tail;
			if(temp.next==tail)
			{
				tail=null;
				System.out.println("single element deleted");
			}
			while(temp.next!=tail)
			{
				temp=temp.next;
			}
			temp.next=tail.next;
			tail=temp;
		}
		
		void deleteAtposition(int value)
		{
			node prev=tail;
			node curr=prev.next;
			
			if(prev==curr)
			{
				tail=null;
				System.out.println("single element deleted");
				return;
			}
			while(curr.data!=value)
			{
				
				prev=curr;
				curr=curr.next;
			}
			if(prev.next==tail)
			{
				prev.next=curr.next;
				curr.next=null;
				tail=prev;
				return;
				
			}
			prev.next=curr.next;
			curr.next=null;
		
		}
		
		void disp()
		{
			node temp=tail;
			if(tail==null)
			{
				System.out.println("list is empty!!");
			}
			else
			{
			
			do
			{
				System.out.print(temp.data +"->");
				temp =temp.next;
			}while(temp!=tail);
			
		}
		}
}


public class circularLlist {

	public static void main(String[] args) 
	{
		cll l=new cll();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many element?");
		int x=sc.nextInt();
		System.out.println("enter element in the list");
		for(int i=0;i<x;i++)
		{
			int t=sc.nextInt();
			l.insertAtb(t);
		}
		l.disp();
		
//		System.out.println("ensert element at position");
//		l.intsertAtPosition(4, 34 );
//		l.disp();
//		
//		System.out.println("insert element at end!!");
//		l.insertAtend(6);
//		l.disp();
//		System.out.println("delete at the end!= ");
//		l.deleteAtend();
//		l.disp();
		
		System.out.println("delete at the position!= ");
		int d=sc.nextInt();
		l.deleteAtposition(d);
		l.disp();
		
		
		
		
		
		

		
		
		
		
	}
}
 

