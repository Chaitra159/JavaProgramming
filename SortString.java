class SortString
{
public static void main(String[] args)
{
String str="lohith ravi babu";
String str1[]=str.split(" ");
String temp;
for(int i=0;i<str1.length;i++)
{
for(int j=i+1;j<str1.length;j++)
{
 if (str1[i].compareTo(str1[j]) > 0)
 {
  temp = str1[i];
  str1[i] = str1[j];
  str1[j] = temp;
 }
}
}
for (int i = 0; i <str1.length; i++) 
{
System.out.println(str1[i]);
}
}
}