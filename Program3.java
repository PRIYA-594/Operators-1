import java.util.*;
public class Program3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = s.nextInt();
		String str = Integer.toString(n);
		System.out.println("The count of no. of digits "+str.length());
		s.close();
	}
}
