package task;
import java.util.*;
public class panagram_t3 {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string: ");
		String s= sc.next();
		panagram(s);
		
	}
	public static void panagram(String s)
	{
		boolean b[]= new boolean[26];
		int index=0;
		int flag=1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				index= s.charAt(i)-'a';
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				index= s.charAt(i)-'A';
			}
			b[index]=true;
		}
		System.out.println();
		
		for(int i=0; i<=25;i++)
		{
			if(b[i]==false)
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("panagram");
		}
		else
		{
			System.out.println("not a panagrm");
		}
	}
	
	
	

}
