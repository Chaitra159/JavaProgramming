class CopyArray
{
public static void main(String[] args)
{
int arr[]={100,200};
int copyLen=arr.length;
int copy[]=new int[copyLen];
int i=0;
while(i<arr.length)
{
System.out.println(copy[i]=arr[i]);
i++;
}
}
}