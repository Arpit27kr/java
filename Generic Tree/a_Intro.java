package Generic_tree;

import java.util.*;

public class a_Intro {
	
	private static class Node
	{
		int data;
		 ArrayList<Node>children=new ArrayList();
	}

	public static void display(Node node)
	{
	    String str=node.data+"---->";
		for(Node child:node.children)
		{
			str=str+child.data+",";
		}
		
		System.out.println(str);
		
		for(Node child:node.children)
		{
			display(child);
		}
		
	}
	public static int size(Node node)
	{
		int s=0;
		for(Node child:node.children)
		{
			int cs=0;
			 cs=cs+size(child);
			s=s+cs;
		}
		s=s+1;
	   return s;
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
	public static int height(Node node)
	{
		int h=-1;
		for(Node child:node.children)
		{
			int ch=height(child);
			h=Math.max(h, ch);
		}
		h=h+1;
		return h;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {10,20,30,-1,40,-1,-1,50,60,-1,-1,-1};
		
		Node root=null;
		Stack <Node>st=new Stack<>();
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
		int s=size(root);
		System.out.println("Size of generic tree is ---->"+s);
		int max=max(root);
		System.out.println("Maximum element in generic tree is ----> " +max);
		int height=height(root);
		System.out.println("Height of generic tree is ----->" +height);
		

	}

}
