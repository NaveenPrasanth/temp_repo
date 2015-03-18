import java.io.*;
import java.*;
import java.util.Scanner;


class SubtitutionCipher 
{
	public static void main(String[] args)
	{
		int i,j;
        String a="abcdef ghijklmnopqrstuvwxyz";
        char[] charArray = a.toCharArray();
	try{	
		FileReader br1 = new FileReader("input.text");
		FileReader br2 = new FileReader("key.text");
		FileWriter br3 = new FileWriter("encrypted.text");
		BufferedReader key = new BufferedReader(br2);
		BufferedReader in = new BufferedReader(br1);
		BufferedWriter out = new BufferedWriter(br3);

		char data;
		String contentBuffer ;
		String keyBuffer;
		keyBuffer = key.readLine();
		char[] keyArray  = keyBuffer.toCharArray();
		
		while((contentBuffer=in.readLine())!=null)
		{
			char[] contentArray = contentBuffer.toCharArray();
			for(j=0;j<contentBuffer.length();j++)
			{
				
				data = contentArray[j];
				for(i=0;i<a.length();i++)
				{
					if(data == charArray[i])
					{
						out.write(keyArray[i]);
						System.out.print(keyArray[i]);
					}
				}
			}
		}
		key.close();
		in.close();
		out.close();
	    }
	    catch(IOException e)
	    {
	    	System.out.println(e);
	    }
	    

	}
}