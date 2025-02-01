package techtest;

import java.util.HashMap;
import java.util.Map;

public class Psession1
{
	
	public static void main(String[] args)
	{
		String str = "aaabbcddeee";
		
		// a3b2c1d2e3;
		
	    char [] ch = str.toCharArray();
	    
	    HashMap<Character,Integer> hsm = new HashMap<Character,Integer>();
	    	   
	    for(char c : ch)
	    {
	    	if(hsm.containsKey(c))
	    	{
	    		hsm.put(c,hsm.get(c)+1);
	    	}
	    	
	    	else
	    	{
	    		hsm.put(c,1);
	    	}
	    	
	    }
		
	    for(Map.Entry<Character,Integer> object : hsm.entrySet())
	    {
	    	
	        System.out.print(object.getKey() + "=" + object.getValue()+ " ");
	    	
	    }
	
	}
	

}
