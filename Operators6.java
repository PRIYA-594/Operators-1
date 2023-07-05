import java.util.*;
public class Operators6 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int principal = s.nextInt();
		int n = s.nextInt();
		int r = s.nextInt();
		System.out.println("SI :"+(principal*n*r)/100);
		s.close();
	}
	
}
