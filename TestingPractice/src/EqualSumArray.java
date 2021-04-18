// Find sub array with equal sum
public class EqualSumArray {

	
	public static void main(String[] args) {
		int[] array= {2,13,4,16,44,17,67};
		int sum=67;
		int n=array.length;
		EqualSumArray obj = new EqualSumArray();
		obj.equalSumArray(array,n,sum);
		
		
	}
	
	public int equalSumArray(int arr[],int n,int sum)
	{
		int curSum=arr[0],start=0,i;
		for(i=1;i<=n;i++)
		{
			while(curSum>sum&&start<i)
			{
				curSum=curSum-arr[start];
				start++;
			}
			if(curSum==sum)
			{
				int p=i-1;
				System.out.println("Sum found between"+start+"and"+p);
				return 1;
			}
			if(i<n)
				curSum=curSum+arr[i];
		}
		System.out.println("No sub array found");
		return 0;
	}
}
