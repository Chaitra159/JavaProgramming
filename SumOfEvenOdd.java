class SumOfEvenOdd
{
public static void main(String[] args)
{
int even=0,odd=0;
int num[]={1,15,0,12,13,16,2};
for(int n:num)
{
if(n%2==0)
{
even=even+n;
}
else
{
odd=odd+n;
}
}
System.out.println("Sum of even: "+even);
System.out.println("Sum of Odd: "+odd);
}
}