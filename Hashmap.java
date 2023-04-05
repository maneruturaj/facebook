package For_loop;

import java.util.HashMap;

public class Hashmap
{

	public static void main(String[] args) 
	{
		HashMap<String,Integer> capitalcities = new HashMap<>();
		
		
		capitalcities.put("Netherlands", 20);
		
		capitalcities.put("USA", 56);
		
		
		capitalcities.put("England", 12);
	
		capitalcities.put("India",46);
		
		
		capitalcities.put("Australia",7);
		
		
		if(capitalcities.containsKey("India"))
		{
		Integer Country	= capitalcities.get("India");
		System.out.println("Value of key India is "+ Country);
		}
		
		//System.out.println("Value of key India is ");
	}

}
