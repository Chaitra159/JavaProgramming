class PrimeEvenOdd
{
public static void main(String[] args)
{
int num=0,count=0;
/*if(num==0||num==1)
{
if(num%2==0)
System.out.println("Even number "+num);
else
System.out.println("Odd number" +num);
}*/
for(int j=1;j<=num;j++)
{
if(num%j==0)
count++;
}
if(count==2)
{
if(num%2==0)
System.out.println("Prime Even Number "+num);
else
System.out.println("Prime Odd Number "+num);
}
else if(num%2==0)
{
System.out.println("Even number "+num);
}
else
{
System.out.println("Odd number" +num);
}
}
}