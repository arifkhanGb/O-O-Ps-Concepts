package basicJava;


public class treeDataSructure {
	
	static class node
	{
		int data;
		node left;
		node right;
		
		node (int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static class BinaryTree
	{
		static int idx=-1;
		public static node buildTree(int nodes[])
		{
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
	}
	
	public static  void preorder(node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree t=new BinaryTree();
		node root=t.buildTree(nodes);
		System.out.println(root.data );
		preorder(root);
	

	}

}
