package Generic_tree;

import java.util.*;

public class prct1 {
	
	private static class Node
	{
		int data ;
		ArrayList<Node>children=new ArrayList<>();
		
		
	}

	
	public static void display(Node node )
	{
		String str=node.data+"----->";
		for(Node child:node.children)
		{
			str=str+child.data+",";
		}
		System.out.println(str+".");
		
		for(Node child:node.children)
		{
			display(child);
		}
		
		
	}
	
	public static int max(Node node)
	{
		int max=Integer.MIN_VALUE;
		for(Node child:node.children)
		{
			int cm=max(child);
			max=Math.max(max, cm);
		}
		max=Math.max(max, node.data);
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {50,60,90,110,-1,-1,100,-1,-1,70,120,140,-1,-1,130,-1,-1,80,150,-1,-1,-1};
		Stack<Node>st=new Stack();
		Node root=null;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==-1)
			{
				st.pop();
			}
			else 
			{
				Node t=new Node();
				t.data=arr[i];
				if(st.size()>0)
				{
					st.peek().children.add(t);
					
				}
				else
				{
					root=t;
				}
				st.push(t);
				
			}
		}
		display(root);
		int max=max(root);
		System.out.println("MAX IS ----->>>>"+max);
		

	}

}
