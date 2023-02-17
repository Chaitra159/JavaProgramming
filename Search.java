class Search
{
public static void main(String[] args)
{
int arr[]={10,5,6,7,8};
int searchNum=5;
boolean present=false;
int index=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==searchNumber)
{
index=i;
present=true;
break;

}
}
if(present==true)
System.out.println(index);
else
System.out.println("Not fount");
}
}
