package day16;

import java.util.HashMap;
import java.util.Map.Entry;

public class Program02 {
	
	//HashMap with Key and Values. Values can be same but keys cannot (only unique).
	//HashMap saves Values in Sequence order
	//HashMap allows null key and null value
	
	public static void main(String[] args) {
		HashMap<String,Integer> x= new HashMap<>();
		x.put("aa", 101); //it is the combined form of set(keys) and list(values)
		x.put("bb", 102);
		x.put("dd", 103);
		x.put("cc", 104);
		x.put("aa", 108); // Duplication of key is allowed but it will replace the value of old instance with new value.
		x.put("ee", 105);
		x.put(null, 105);
		x.put("ff", null);
		
		System.out.println(x);
		
		System.out.println(x.keySet());
		
		System.out.println(x.values());
		
		System.out.println(x.entrySet());
		
		System.out.println(x.containsKey("bb"));
		
		System.out.println(x.containsValue(102));
		
		System.out.println(x.get("cc"));
		
		System.out.println(x.isEmpty());
		
		System.out.println(x.size());
		
		for(String keys:x.keySet())
		{
			System.out.println(keys);
		}
		
		for(Integer value:x.values())
		{
			System.out.println(value);
		}
		
		for(Entry<String, Integer> entry: x.entrySet())
		{
			System.out.println(entry.getKey() +"   "+entry.getValue());
		}
		
		x.clear();
		
		System.out.println(x);

	}

}