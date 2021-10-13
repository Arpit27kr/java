package hello;

public class remove_at {
	
	public  class Node
	{
		int data;
		Node next;
		
		
		public void Node()
		{
			this.data=data;
			this.next=null;
	
		}
		
	}
	public static  Node head=null;
	public static Node tail=null;
 
	public void addstart(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		if(head==null)
		{
			head=tail=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	public void  display()
	{
		
		if(head==null)
		{
			System.out.println("EMPTY !!!!");
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
		
	}
	public static  int size()
	{
		Node temp=head;
		int s=0;
		while(temp!=null)
		{
			s++;
			temp=temp.next;
		}
		return s;
	}
	
	public void removefirst()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("EMPTY");
		}
		else if(head.next==null)
		{
			head=tail=null;
		}
		else
		{
			head=head.next;
			
		}
	}
	public void removelast(int p)
	{
		if(head==null)
		{
			System.out.println("empty list");
		}
		else
		{
			Node temp=head;
		for(int i=0;i<p-2;i++)
			{
				temp=temp.next;
				
			}
			
			tail=temp;
			temp.next=null;
		}
		
	}
	
	
	
	public void removeat(int idx,int p)
	{
		if(head==null)
		{
			System.out.println("EMPTY LIST !!!!!");
		}
		else if(idx<0 || idx>p)
		{
			System.out.println("INVALID ARGUMENTS ");
		}
		else if(idx==1)
		{
			removefirst();
			
		}
		else if(idx==p-1) 
		{
			removelast(p);
		}
		else
		{
			Node node=head;
			for(int i=0;i<idx-1;i++)
			{
				node=node .next;
			}
			node.next=node.next.next;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		remove_at li=new remove_at();
		li.addstart(52);
		li.addstart(62);
		li.addstart(223);
		li.addstart(520);
		li.addstart(624);
		li.addstart(235);
		
		int p=size();
		
		li.removeat(3, p );
		li.display();
		

	}

}
