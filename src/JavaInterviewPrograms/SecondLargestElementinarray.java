package BasicProblemsolving;

public class SecondLargestElementinarray {

	public static int i;
	public static int n;
	public static int First_Max = 0;
	public static int Second_Max;

	public void SecondMaxElement(int n, int a[]) {

		for (int i = 0; i < n ; i++) {

			if (a[i] > First_Max) {
				Second_Max = First_Max;
				First_Max = a[i];
			}
		
			if (a[i] < First_Max && a[i] > Second_Max) {
				Second_Max = a[i];
			}

		}
		System.out.println("Largest value in this array is " + First_Max);
		System.out.println("Second Largest value in this array is " + Second_Max);
	}

	public static void main(String args[]) {

		int a[] = { 10, 45, 55, 75, 29, 60 };
		n = a.length;
		System.out.println("Length of this array is " + n);
		SecondLargestElementinarray s = new SecondLargestElementinarray();
		s.SecondMaxElement(n, a);

	}

}
