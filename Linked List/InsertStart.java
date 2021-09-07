/*
 * Java program to insert a new node at the beginning of the singly linked list
 * 
 */
public class InsertStart {
	class Node{
		int data;
		Node next;
	
	public   Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	}
	 
	public Node head=null;
	public Node tail=null;
	
	public void addstart(int data)
	{
		Node nn=new Node(data);
		if(head==null)
		{
			head=nn;
			tail=nn;
		}
		else {
			Node temp=head; //temp will point at head
			head=nn;
			head.next=temp;
			
		}
		
	}
	public void display()
	{
		Node cc=head;
		if(head==null)
		{
			System.out.println("EMPTY NODE");
			
		}
		else {
			while(cc!=null)
			{
				System.out.println(cc.data);
				cc=cc.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		InsertStart nn=new InsertStart();
		nn.addstart(4);
		
		nn.addstart(5);
		
		nn.addstart(6);
		nn.display();
		
	
	
	}
	}


