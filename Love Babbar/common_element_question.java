import java.lang.reflect.Array;
import java.util.Arrays;

public class common_element_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,7,28,12,17};
		Arrays.sort(a);
		for(int val:a)
		{
		System.out.print(+val+",");
		}
		int b[]= {4,12,18,24,30};
		Arrays.sort(b);
		System.out.println();
		for(int val:b)
		{
		System.out.print(+val+",");
		}
		int c[]= {4,6,9,12,17};
		Arrays.sort(c);
		System.out.println();
		for(int val:c)
		{
		System.out.print(+val+",");
		}
		System.out.println();
		
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length && k<c.length)
		{
			if(a[i]==b[j]&&b[j]==c[k])
			{
				System.out.println(" common Number in sorted arrays are "+a[i]);
				i++;
				j++;
				k++;
			}
			else
			{
			i++;
			j++;
			k++;
			}
		}
		
		
		

	}

}
