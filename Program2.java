import java.util.Scanner;
public class Program2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = s.nextInt();
		int sum = 0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		System.out.println("The sum of Digits is "+sum);
		s.close();
	}
}
