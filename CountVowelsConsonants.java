class CountVowelsConsonants
{
public static void main(String[] args)
{
String str="chaitra";
int vowelsCount=0,consonantsCount=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O')
vowelsCount++;
else
consonantsCount++;
}
System.out.println("Vowels Count "+vowelsCount);
System.out.println("Consonants Count "+consonantsCount);

}
}