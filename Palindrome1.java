class Palindrome1
{
public static void main(String[] args)
{
char str[]="mom";
char ch[]=new char[str.length()-1];
for(int i=str.length()-1;i>=0;i++)
ch[i]=str.charAt(i);
if(str.equals(ch))
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}