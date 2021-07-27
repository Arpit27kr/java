// creating annonymous array is for instant usage -----   new int[]{10,20,30}-----this is anonymous array 
//it is always unsized
//we can create multidimentional anonymous array also ex- new int [] [] {{10,20}, {10,40,60}} 
//we can give the name for anonymous array then it is no longer annonymous----------- int[] x= new int[]{10,20,30}
public class anonymous_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(new int[] {10,20,30,40}); // anonymous array

	}
	
	public static void sum(int [] x)
	{
		int total=0;
		for(int  x1:x)
		{
			total=total+x1;
		}
		System.out.println(total);
	}

}
