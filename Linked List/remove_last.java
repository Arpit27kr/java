package hello;

public class remove_last {
	
	public class Node
	{
		int data;
		Node next;
		
		public void Node()
		{
			this.data=data;
			this.next=null;
		}
		
		
	}
	public static Node head;
	public static Node tail;
	
	public void addfirst(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=head;
		head=temp;
		if(head==null)
		{
			head=tail=null;
		}
		
		
		
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("EMPTY LINKED LIST !!!!");
		}
		
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println();
			
			
		
	}
	public static int size()
	{
		int s=0;
		Node temp=head;
		while(temp!=null)
		{
			s++;
			temp=temp.next;
		}
		return s;
	}
	
	public void removelast(int s)
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("EMPTY !!!!!!");
		}
		else 
		{
			for(int i=0;i<s-2;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove_last li=new 	remove_last();
		li.addfirst(10);
		li.addfirst(60);
		li.display();
		
		int p=size();
		System.out.println(p);
		li.removelast(p);
		li.display();

	}

}
