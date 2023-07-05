import java.util.Scanner;
public class Program1OtherMethod {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = s.nextInt();
		if((n&1)==1)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Even");
		}
		s.close();
	}
}
