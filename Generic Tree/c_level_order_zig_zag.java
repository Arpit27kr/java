package Generic_tree;

import java.util.*;

public class c_level_order_zig_zag {
	
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

	public static void level_print(Node node)
	{
		Queue<Node>q=new ArrayDeque<>();
		q.add(node);
		
		while(q.size()>0)
		{
			node=q.remove();
			System.out.print(node.data+ " ");
		for(Node child:node.children)
		{
			q.add(child);
		}
		
	}
		System.out.print(".");
		
	}
	
	public static void linewise(Node node)
	{
	
		Queue<Node> queue = new ArrayDeque<>();
	      queue.add(node);

	      Queue<Node> cqueue = new ArrayDeque<>();
	      while(queue.size() > 0){
	        node = queue.remove();
	        System.out.print(node.data + " ");

	        for(Node child: node.children){
	          cqueue.add(child);
	        }

	        
	        if(queue.size() == 0){
	          queue = cqueue;
	          cqueue = new ArrayDeque<>();
	          System.out.println();
	        } 
	      }
	}
	public static void level_zig_zag(Node node)
	{
		int l=1;
		Stack<Node>s=new Stack<>();
		s.push(node);
	
		Stack<Node>cs=new Stack<>();
		while(s.size()>0)
		{	node=s.pop();
		
		System.out.print(node.data + " ");
		
		if(l%2==0)
		{
			for(int i=0;i<node.children.size();i++)
			{
				Node child=node.children.get(i);
				cs.push(child);
			}
			
		}
		else
		{
			for(int i=node.children.size()-1;i>=0;i--)
			{
				Node child=node.children.get(i);
				cs.push(child);
			
				
				
				
			}
		}
		
		
		
		
		
		if(s.size()==0)
		{
			s=cs;
			cs=new Stack();
			l++;
			System.out.println();
			
		}
		}
		
		
		
		
		
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
		//display(root);
		//int s=size(root);
		//System.out.println("Size of generic tree is ---->"+s);
		//int max=max(root);
		//System.out.println("Maximum element in generic tree is ----> " +max);
		//int height=height(root);
		//System.out.println("Height of generic tree is ----->" +height);
		
	  //level_print(root);
	  //linewise(root);
		level_zig_zag(root);
		
	   

		
	}

}
