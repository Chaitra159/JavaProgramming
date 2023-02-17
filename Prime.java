class Prime
{
public static void main(String[] args)
{
int sum=0,count,j;
for(int i=15;i>=15&&i<=30;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
System.out.println(i);
sum=sum+i;
}
}
System.out.println("Sum of prime number is "+sum);
}
}