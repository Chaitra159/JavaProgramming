class AverageGreater
{
public static void main(String[] args)
{
double arr[]={1,4,1,6,5};
double sum=0,average=0;
int count=0;
for(double num:arr)
{
sum=sum+num;
count++;
}
average=sum/count;
System.out.println("Average "+average);
System.out.println("Greater than the Average :");
for(double num1:arr)
{
if(num1>average)
System.out.println(num1);
}
}
}