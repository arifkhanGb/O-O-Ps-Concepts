package basicJava;
import java.util.*;

class listL
{
	node head;
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
		void add(int data)
		{
			node newnode=new node(data);
			if(head==null)
			{
				head=newnode;
				return;
			}
			else
			{
			newnode.next=head;
			head=newnode;
			}
			
		}  
		void printlist()
		{
			
			if(head==null)
			{
				System.out.println("list is empty");
				return;
			}
			node temp;
			temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("Null");
		}
		void search(int x , int p)
		{
			
			node t;
			t=head;
			if(head==null)
			{
				System.out.println("list is empty");
				return;
			}
			while(t!=null)
			{
				if(t.data==x)
				{
					System.out.println("element fount at index No."+p);
					return;
				}
				if(t.data>25)
				{
				  head=t.next;
				}
				t=t.next;
				
			}
			
			
		}
		void addAtposition(int data, int p)
		{
			if(p==1)
			{
				add(data);
				return;
			}
			node n=new node(data);
			node t=head;
			int cnt=1;
			while(cnt<p-1)
			{
				t=t.next;
				cnt++;
			}
			n.next=t.next;
			t.next=n;
			System.out.println("value at"+p);
		}
		void deleteAtposition(int p)
		{
			node t=head.next;
			node s=head;
			if(p==1)
			{
				deleteF();
				return;
			}
			int cnt=1;
			while(cnt!=p-1)
			{
				t=t.next;
				s=s.next;
				cnt++;	
			}
			s.next=t.next;
			
			
		}
		void deleteF()
		{
			head=head.next;
		}
	
		
	}
	
	
 
public class linkList {
	public static void main(String []args)
	{
		listL l=new listL();
		Scanner s=new Scanner(System.in);
		  int x;
//		  System.out.println("enter value in list");
//		for(int i=0;i<4;i++)
//		{
//			x=s.nextInt();
//			l.add(x);
//			
//			
//		}
//	
		l.add(2);
		l.add(8);
		l.add(3);
		l.add(7);
		l.add(5);
		l.add(1);
		System.out.println("list is given bilow");
		l.printlist();
		l.addAtposition(45, 2);
		
		l.printlist();
		l.deleteAtposition(4  );
		
		l.printlist();
		
		
		
	
	}

}
	


