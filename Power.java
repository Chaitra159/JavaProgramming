class Power
{
public static void main(String[] args)
{
int number=2;
int power=4;
int result=1;
if(power==0)
{
System.out.println(1);
}
else
{
for(int i=1;i<=power;i++)
result=result*number;
}
System.out.println(result);
}
}