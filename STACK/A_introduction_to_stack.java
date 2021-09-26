import java.util.Stack;

public class A_introduction_to_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>st=new Stack<>();
		st.push(10);
		System.out.println(st+ "--->" +st.peek()+"Size is " +st.size());
		st.push(20);
		System.out.println(st+"--->" +st.peek()+"Size is " +st.size());
		st.push(30);
		System.out.println(st+"--->" +st.peek()+"Size is " +st.size());
		st.push(40);
		System.out.println(st+"--->" +st.peek()+"Size is " +st.size());
		st.pop();
		System.out.println(st+"--->" +st.peek()+"Size is " +st.size());
		st.pop();
		System.out.println(st+"--->" +st.peek()+"Size is " +st.size());
		
		
		

	}

}
