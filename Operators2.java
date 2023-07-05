import java.util.Scanner;
public class Operators2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Binary Number ");
		int bin = s.nextInt(2);
		System.out.println("Decimal Number ");
		System.out.println(bin);
		String octal = Integer.toOctalString(bin);
		System.out.println("Octal Number ");
		System.out.println(octal);
		s.close();
	}
}
