package OverloadingMethod;
import utility.StringUtility;
public class StringOperation {
public static void main(String arg[])
{
	StringUtility s=new StringUtility();
	s.reverseString("chaitra");
	System.out.println("Count of String:"+s.countString("chaitraravira","ra"));
	s.palindrome("mom");
}
}
