package basicJava;
import java.util.*;

class stack
{
	int top;
	int arr[];
	int size;
	
	stack(int size)
	{
		this.size=size;
		arr=new int[size];
		top=-1;
    }
	void push(int data)
	{
		if(size-top>1)
		{
			top++;
			arr[top]=data;
		}
		else
		{
			System.out.println("stack is overflow");
		}
	}
	void pop()
	{
		if(top>=0)
		{
			top--;
		}
		else
		{
			System.out.println("stack is underflow");
		}
		
	}
	int peek()
	{
		if(top>=0)
		{
		return arr[top];
		}
		else
		{
			System.out.println("stack is empty");
			return -1;
		}

	}
	 boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class stackk {

	public static void main(String[] args) {

		stack s=new stack(5);
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		s.push(5);
		
//		boolean a=s.isEmpty();
		System.out.println(s.isEmpty());
//		System.out.println(s.peek());
//		System.out.println();
		
		
//		s.pop();
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
//		
//		

	}

}
