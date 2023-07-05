import java.util.*;
public class Program1 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = s.nextInt();
		int num = n%10;
		int f = 0;
		for(int i=0;i<=8;i+=2)
		{
			if(num==i)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		s.close();
	}

}
