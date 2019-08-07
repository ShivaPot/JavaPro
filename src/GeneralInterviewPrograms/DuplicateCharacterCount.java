package GeneralInterviewPrograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterCount 
{
	public static void main(String[] args) 
	{
		String inputString = "aaaabbbbccccdddd";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] stringArray = inputString.toCharArray();
		for(Character value : stringArray)
		{
			if(map.containsKey(value))
			{
				map.put(value, map.get(value) + 1);
			}
			else
			{
				map.put(value, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(Character values: keys)
		{
			if(map.get(values) > 1)
			{
				System.out.print(values + "" + map.get(values));
			}
		}
	}
}
