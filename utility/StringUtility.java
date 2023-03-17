package utility;

public class StringUtility {

	public void reverseString(String s1)
	{
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
			
		}
		System.out.println("Reverse string:"+rev);
	}
	public int countString(String s1,String sub)
	{
		if(s1.contains(sub))
		{
			return 1+countString(s1.replaceFirst(sub, ""),sub);
		}
			
		return 0;		
	}
	
	public void palindrome(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	}
