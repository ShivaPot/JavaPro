package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept
{
	//HashMap is a Class implements Map Interface.
	//HashMap stores values in the form of Key and Value Pair.
	//It maintains no Order.
	//It contains only unique Elements
	//Put() is used to add Elements into HashMap
	//HashMap is Non-Synchronised - It is not Thread Safe
	public static void main(String args[])
	{
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Java");
		hashMap.put(2, "Selenium");
		hashMap.put(3, "Python");
		hashMap.put(4, "Maven");
		
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(4));
		
		//Iterating HashMap using entrySet()
		for(Entry m : hashMap.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//To Remove Value from HashMap
		hashMap.remove(4); //Maven is Removed
		
		//To Print HashMap Objects
		System.out.println(hashMap);
		
		System.out.println("########################");
		
		HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 23, "Admin");
		Employee e2 = new Employee("Ram", 24, "Tester");
		Employee e3 = new Employee("Peter", 25, "Developer");
		
		employee.put(1, e1);
		employee.put(2, e2);
		employee.put(3, e3);
		
		//Traverse the HashMap
		for(Entry<Integer, Employee> m : employee.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee " + key + " Info : ");
			System.out.println(e.name + " " +e.age + " " +e.dept);
		}
	}
}
