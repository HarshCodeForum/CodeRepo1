
public class Fabi {
	public static void main(String[] args) {
		int c1=0,c2=1,c3,i,count=20;
		for(i=2;i<count;i++)
		{
			c3=c1+c2;
			c1=c2;
			c2=c3;
			System.out.println(c3);
		}
		
	}

}
