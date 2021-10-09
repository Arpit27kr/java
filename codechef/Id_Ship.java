package hello;
import java.util.*;
public class Id_Ship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{

		char id = input.next().charAt(0); 
		if(id=='b'||id=='B')
		{
			System.out.println("BattleShip");
			
		}
		else if(id=='c'||id=='C')
		{
			System.out.println("Cruiser");
		}
		else if(id=='d'||id=='D')
		{
			System.out.println("Destroyer");
		}
		else if(id=='f'||id=='F')
		{
			System.out.println("Frigate");
		}
		
		
		

	}
	}
}
