package OopsConcepts;

public class InheritanceBaseClass
{
	int i = 100;
	static int j = 200;
	private int k = 300; //It does not get inherited
	
	public void print()
	{
		System.out.println("I Value is ::: " +i);
	}
	
	public static void display()
	{
		System.out.println("J Value is ::: " +j);
	}
}
