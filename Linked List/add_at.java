package hello;

public class add_at {
	
	public class Node{
		int data;
		Node next; 
		
		public void Node()
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static   Node head=null;
	public static Node tail=null;
	
	public void addstart(int val )
	{
		Node temp=new Node();
	    temp.data=val;
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
	public void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println();
		}
		
		
		
		
	}
	public void addlast(int val)
	{
		Node temp=new Node();
		temp.data=val;
		temp.next=null;
		if(head==null)
		{
			head=tail=temp;
		}
		else
		{
			tail.next=temp;
			tail=temp;
		}
	}
	
	public static int size()
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
	
	public void addat(int idx,int s,int data)
	{
		
		if(idx>s || idx<0)
		{
			System.out.println("Invaid arguments ");
		}
		else if(idx==0)
		{
			addstart(data);
		}
		else if(idx==s)
		{
			addlast(data);
		}
		else {
			Node node=new Node();
			node.data=data;
			node.next=null;
			Node temp=head;
			for(int i=0;i<idx-1;i++)
			{
				
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add_at li=new add_at();
		li.addstart(5);
		li.addstart(154);
		li.addstart(41);
		li.addstart(512);
		li.addlast(12);
		li.addlast(165);
		li.addlast(125);
		int p=size();
		li.addat(3, p,15);
		//System.out.println(p);
		li.display();
		

	}

}
