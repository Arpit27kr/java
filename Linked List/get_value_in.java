package hello;

public class get_value_in {
	
	 class Node
	{
		int data;
		Node next;
		
		 public Node(int data)
		 {
			 this.data=data;
			 this.next=null	 ;
		 }
		 
	}
	 public static Node head=null;
	 public static Node tail=null; 
	
	 public void addlast(int data)
	 {
		 Node temp=new Node(data);
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
	 public void display()
	 {
		 Node temp=head;
		 if(head==null)
		 {
			 System.out.println("empty list");
		 }
		
			 while(temp!=null)
			 {
				 System.out.println(temp.data+ " ");
				 temp=temp.next;
			 }
			 System.out.println();
		
		 
	 }
	 public void removefirst()
	 {
		 if(head==null)
		 {
			 System.out.println("empty");
			 
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
	 public static int size()
	 {
		 int s=0;
		 Node temp=head;
		 while(temp!=null)
		 {
			 temp=temp.next;
			 s++;
		 }
		 return s;
	 }
	 public void getfirst()
	 {
		 if(head==null)
		 {
			 System.out.println("EMPTY LIST !!!!");
		 }
		 else 
		 {
			 Node temp=head;
			 System.out.println(head.data); ; 
		 }
		 
	 }
	 public void getlast()
	 {
		 if(head==null)
		 {
			 System.out.println("EMPTY LINKED LIST !!!!");
		 }
		 else 
		 {
			
			 System.out.println(tail.data);
				 
			 
		 }
		 
	 }
	 public void getat(int idx,int s)
	 {
		 if(idx<0 || idx>s)
		 {
			 System.out.println("Invalid arguments !!");
		 }
		 else if(head==null)
		 {
			 System.out.println("List is empty");
		 }
		 else
		 {
			 Node temp=head;
			 for(int i=0;i<idx-1;i++)
			 {
				temp=temp.next;
			 }
			 System.out.println(temp.data);
		 
		 }
		 
	 }
	
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get_value_in ls=new get_value_in();
		ls.addlast(50);
		ls.addlast(60);
		ls.addlast(80);
		ls.addlast(70);
		//ls.display();
		int p=size();
		//System.out.println(p);
		//ls.getfirst();
		ls.getlast();
		ls.getat(3, p);
		
		
		
		

	}

}
