package hello;



public class addfirst {
	
	
	public class Node
	{
		int data;
		Node next;
		
		
		public void Node(int data)
		{
			this.data=data;
			this.next=null;
			
		}
		
	}
	public static Node head=null;
	public static Node tail=null;
	
	public void addlast(int data)
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
		    tail.next=temp;
			tail=temp;
		}
	}
	public void addfirst(int data)
	{
		Node temp=new Node();
		temp.data=data;
		if(head==null)
		{
			tail=null;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("empty");
		}
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	public void removefirst()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("EMPTY");
		}
		else if(temp.next==null)
		{
			head=tail=temp;
			
		}
		else
		{
			head=head.next;
			
		}
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addfirst ls=new addfirst();
		
		ls.addlast(6);
		ls.addfirst(15);
		ls.addfirst(56);
		ls.addlast(25);
		ls.addfirst(852);
		ls.removefirst();
		
		
		ls.display();

	}

}
