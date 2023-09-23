package basicJava;
import java.util.*;

import basicJava.listL.node;

class ll
{
	node head=null;
	node tail=null;
	node last =null;
	class node {
		 
		
		node prev=null;
		int data;
		node next=null;
		
		node (int data)
		{
			
			this.prev=null;
			this.data=data;
			this.next=null;
		}
	}
	void addData(int data)
	{
		node n=new node(data);
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			n.next=head;
			head.prev=n;
			head=n;	
		}
	}
	
	 void insetAttail(int data)
	 {
		 node n=new node(data);
		 node temp=head;
		 
			if(head==null)
			{
				head=n;
				return;
			}
			
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=n;
				n.prev=temp;
			
	 }
	 
	 void insertAtposition(int data, int element)
	 {
		 if(element==1)
			{
			 addData(data);
				return;
			}
		 node n=new node(data);
		 node temp=head;
		 int cnt=1;
		 if(head==null)
			{
				head=n;
				return;
			}
		while(cnt<element-1)
		{
				temp=temp.next;	
				cnt++;
		}
		
		n.next=temp.next;
		temp.next.prev=n;
		temp.next=n;
		n.prev=temp;
		 
	 }
	 void deleteAtposition(int value)
	 {
		 node t=head;
		 if(t.data==value)
		 {
			 deleteFrst();
			 return;
		 }
		 while(t.data!=value)
		 {
			 
		 t=t.next;
		 if(t==null)
		 {
			 System.out.println("value not found");
			 return; 
		 }
		 }
		 if(t.next==null)
		 {
			 deleteLast();
			 return;
		 }
		 
		 t.prev.next=t.next;
		 t.next.prev=t.prev;
		 t.prev=null;
		 t.next=null;
	 }
	 void deleteFrst()
	 {
		 node temp=head;
		 if(head==null)
			{
				System.out.println("list is empty");
				return;
			}
		  if(temp.next==null)
		  {
			  head=temp.next;
			  return;
		  }
		   temp.next.prev=null;
		   head=temp.next;
		   temp.next=null;
	 }
	 
	
	 
	void disp()
	{
		node temp=head;
		//node last=null;
		if(temp==null)
		{  
			System.out.println("list is empty");
		
		}
		while(temp!=null)
		{
			
			System.out.print(temp.data+"->");
			last=temp;
			temp=temp.next;
		}
		System.out.println();
		
	
	}
	 void deleteLast()
	 {
		node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.prev.next=null;
		t.prev=null;

	 }
	 
	
	void reverse()
	{
		System.out.println("revesre list!!");
		while(last!=null)
		{
			
			System.out.print(last.data+"->");
			
			last=last.prev;
		}
		
	}
}




public class doublyLlist {

	public static void main(String[] args)
	{
		ll l=new ll();
		
 		 
			l.addData(1);
			//l.disp();
			System.out.println(" ");
 
			
  
			l.addData(12);
			//l.disp();
			System.out.println();
			
			//l.addData(13);
			//l.disp();
			System.out.println(); 
			
			//l.addData(14);
			System.out.println("given list is!!");
			l.disp();
			System.out.println(); 
			
//			System.out.println("insert at tail");
//			l.insetAttail(15);
//			l.disp();
//			System.out.println();
////  
////			
//			System.out.println("element inserted at position");
//			l.insertAtposition(5,3);
//			l.disp();
//			System.out.println();
////			
////			
////			//l.disp();
////			//System.out.println();
//// 
////			
//			System.out.println("delete first element");
//			l.deleteFrst();
//			l.disp();
////			
//			System.out.println("delete last element");
//			l.deleteLast();
//			l.disp();
//			
			
			
			System.out.println("element deleted at position");
			l.deleteAtposition(12);
			l.disp();
			
			//l.reverse();
 
			
		
			
			

			    
		}
		
		
		

		
	
		
		
		
	}

	


