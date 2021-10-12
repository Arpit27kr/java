package hello;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist_addlast {
	
	class Node
	{
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
	
    public void addlast(int data) {    
        //Create a new node    
        Node temp = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
           head=tail=temp;  
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = temp;    
            //newNode will become new tail of the list    
            tail = temp;    
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linkedlist_addlast ls=new linkedlist_addlast();
		Scanner input=new Scanner(System.in);
		//int t=input.nextInt();
		ls.addlast(50);
		ls.addlast(60);
	
		ls.display();
	}

}
