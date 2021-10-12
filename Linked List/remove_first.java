package hello;

import java.util.LinkedList;
import java.util.Scanner;



public class remove_first {
	
	class Node{
		int data;
		Node next;
		
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		
	}
	  public static Node head = null;  
	    public static Node tail = null; 
	
	
	
	public void addlast(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=tail=temp;
		}
		else {
			tail.next=temp;
			tail=temp;
			
		}
	}
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("empty");
		}
		System.out.println("Nodes of singly linked list: ");    
	
		while(temp!=null)
		{
			System.out.println(temp.data +"");
			temp=temp.next;
		}
		System.out.println();
		
	}
	public void removefirst()
	{
		if(head==null)
		{
			System.out.println("Empty");
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
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove_first ls=new remove_first();
		ls.addlast(50);
		ls.addlast(45);
		ls.addlast(60);
		ls.display();
		ls.removefirst();
		ls.display();
		
		
		

	}

}
