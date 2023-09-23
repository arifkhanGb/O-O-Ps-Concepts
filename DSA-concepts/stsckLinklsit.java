package basicJava;
import java.util.*;


public class stsckLinklsit {
	
	static class node
	{
		int data;
		node next;
	public node(int data)
	{
		this.data=data;
		next=null;
	}
	}
	static class stack
	
{
		
		public static node head;
		public static boolean isEmpty()
		{
			return head==null;
		}
		
		public static void push(int data)
		{
			node n=new node(data);
			if(isEmpty())
			{
				head=n;
				return;
			}
			n.next=head;
			head=n;
		}
		public static int  pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			 return head.data;
		}
		
		
	}
	

	public static void main(String[] args) {

		stack s=new stack();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}

	}

}
