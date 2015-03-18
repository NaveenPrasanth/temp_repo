/* Program to implement subtitution cipher in java 
Created on : 18.03.2015
Reason : Assignment for OOP paper 
Author : Naveen Prasanth (nnpths01)
*/

import java.io.*;
import java.*; 
import java.util.Scanner;


class SubtitutionCipherEncrypt
{
	public encryptText()
	{
		int i,j;
        String a="abcdef ghijklmnopqrstuvwx.yz";
        char[] charArray = a.toCharArray();

		try
		{	
			FileReader read1 = new FileReader("input.text");
			FileReader read2 = new FileReader("key.text");
			FileWriter write1 = new FileWriter("encrypted.text");
			BufferedReader key = new BufferedReader(read2;
			BufferedReader in = new BufferedReader(read1);
			BufferedWriter out = new BufferedWriter(write1);

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



class SubtitutionCipherDecrypt
{
	public static decryptText()
	{
		int i,j;
        String a="abcdef ghijklmnopqrstuvwx.yz";
        char[] charArray = a.toCharArray();

		try
		{	
			FileWriter write1 = new FileWriter("decrypted.text");
			FileReader read1 = new FileReader("key.text");
			FileReader read2 = new FileReader("encrypted.text");
			BufferedReader key = new BufferedReader(read1);
			BufferedReader enc = new BufferedReader(read2);
			BufferedWriter dec = new BufferedWriter(write1);

			char data;
			String encryptBuffer ;
			String keyBuffer;
			keyBuffer = key.readLine();
			char[] keyArray  = keyBuffer.toCharArray();
				
			while((encryptBuffer=in.readLine())!=null)
			{
				char[] encryptArray = encryptBuffer.toCharArray();
				for(j=0;j<encryptBuffer.length();j++)
				{
						
					data = encryptArray[j];
					for(i=0;i<a.length();i++)
					{
						if(data == keyArray[i])
						{
							out.write(charArray[i]);
							System.out.print(charArray[i]);
						}
					}
				}
			}
			key.close();
			inc.close();
			dec.close();
	    }
		    
		catch(IOException e)
		{
		    System.out.println(e);
		}
	    

	}
}
class SubtitutionCipherNaveen extends SubtitutionCipherDecrypt
{
	public static void main(String[] args)
	{
		SubtitutionCipherDecrypt n = new SubtitutionCipherDecrypt();
		n.decryptText();
		
	}
}