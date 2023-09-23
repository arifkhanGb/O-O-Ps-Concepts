package basicJava;

class Treee
{
	

class node
{
	node left;
	int data;
	node right;
	
	node(int data)
	{
		this.left=null;
		this.data=data;
		this.right=null;
	}
}
    int idx=-1;
	public node buildTree(int nodes[])
	{
		node root;
		idx++;
		if(nodes[idx]==-1)
		{
			return null;
		}
		node n=new node(nodes[idx]);
		n.left=buildTree(nodes);
		n.right=buildTree(nodes);
		
	    return n;
		
		
		
		
	}


public class binaryTree {

	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,-1,-1,3,-1,6-1,-1,7,-1};
		Treee t=new Treee();
	   node root=t.buildTree(nodes);
	   System.out.println(root.data);

	}

}
}
