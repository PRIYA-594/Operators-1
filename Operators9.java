import java.util.*;
public class Operators9 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int min = ((num1%10)<(num2%10))?(((num1%10)<(num3%10))?num1:num3):(((num2%10)<(num3%10))?num2:num3);
		System.out.println(min);
		s.close();
	}
}
