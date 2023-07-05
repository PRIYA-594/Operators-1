import java.util.*;
public class Program5 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] st = str.split("\\s",0);
		for(int i=0;i<st.length;i++)
		{
			if(i%2==0)
			{
				for(int j=st[i].length()-1;j>=0;j--)
				{
					System.out.print(st[i].charAt(j));
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(st[i]+" ");
			}
		}
		s.close();
	}
}
