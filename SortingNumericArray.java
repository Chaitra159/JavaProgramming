class SortingNumericArray
{
public static void main(String[] args)
{
int numericArray[]={30,10,10,40,20,60};
int temp=0;
for(int i=0;i<numericArray.length;i++)
for(int j=i+1;j<numericArray.length;j++)
{
if(numericArray[i]>=numericArray[j])
{
temp=numericArray[i];
numericArray[i]=numericArray[j];
numericArray[j]=temp;
}
}
for(int num:numericArray)
System.out.println(num);
}
}
