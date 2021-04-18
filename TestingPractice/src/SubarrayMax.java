// To find max sum of sub array
public class SubarrayMax {

	public static void main(String[] args) {
	int[]	array = {3,4,-4,};
	int sum = Sum(array);
	System.out.println("Sum is: "+sum);
	}
	
	public static int Sum(int[] a)
	{
		int current=a[0];
		int global=a[0];
		for(int i=1; i<a.length; i++)
		{
			current= Math.max(a[i],a[i]+current);
			if(current>global)
			{
				global=current;
			}
		}
		return global;
	}
}
