class Palindrome
{
public static void main(String[] args)
{
String str="mom";
string reverse="";
for(int i=str.length()-1;i>=0;--i)
{
char ch=str.charAt(i);
reverse=reverse+ch;
}
if(str.equals(reverse))
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}