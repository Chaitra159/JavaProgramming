
class Unique
{
public static void main(String[] args)
{
String str="mom";
int flag=0;
int count=0;
for(int i=0;i<str.length();i++)
{
for(int j=0;j<str.length();j++)
{
if(str.charAt(i)==(str.charAt(j)) && i!=j)
flag=1;
break;
}
if(flag==0)
{
count++;
}
}

System.out.println(count);
}
}