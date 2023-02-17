class CountOfPositiveNegativeZero
{
public static void main(String[] args)
{
int arr[]={-11,-12,0,0,12,13,14};
int pCount=0,zCount=0,nCount=0;
for(int num:arr)
{
if(num>0)
pCount++;
else if(num==0)
zCount++;
else
nCount++;
}
System.out.println("Postive num "+pCount);
System.out.println("Negative num "+nCount);
System.out.println("Zero num "+zCount);
}
}