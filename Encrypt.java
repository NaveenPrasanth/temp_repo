import java.*;
import java.util.Scanner;
class Encrypt
{
	public static void main(String[] args)
	{
		String a="abcde fghijklmnopqrstuvwxyz";
		String c="jnfmg ehyzxbuaopiqwcdvkrstl";
		String content="naveen prasanth";
		char data;
		char[] charArray = a.toCharArray();
		char[] charArray1 = c.toCharArray();
		char[] contentArray = content.toCharArray();
		int i,j ;
		//Scanner ob = new Scanner(System.in);
		//data=ob.next();
		
		for(j=0;j<content.length();j++)
		{
				data=contentArray[j];
				for (i=0;i<26;i++)
				{
					if(data==charArray[i])
					{
						System.out.print(charArray1[i]);
					}
				}
	    }
    }
}