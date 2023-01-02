package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class intro01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm =new HashMap<>();
		hm.put("india", 001);
		hm.put("USA", 002);
		hm.put("BHUTAN", 003);
		hm.put("CHINA", 004);
		hm.put("NIGERIA", 005);
		
		System.out.println(+hm.get("india")+"      " +hm.get("USA"));
		hm.put("india",8);
		System.out.println(hm.containsKey("india"));
		System.out.println(hm.containsKey("rus"));
		System.out.println(hm);
		Set<String>key=hm.keySet();
		System.out.println(key);
		for(String keys: hm.keySet())
		{
			Integer val=hm.get(keys);
			System.out.println(keys + " " +val);
		}
		
		

	}

}
