class EvenOddArray
{
public static void main(String[] args)
{
int arr[]={10,21,33,40,57,60,79,80,99,100};
int evenLen=0,oddLen=0;
for(int num:arr)
{
if(num%2==0)
evenLen++;
else
oddLen++;
}
int even[]=new int[evenLen];
int odd[]=new int[oddLen];
int e=0,o=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
even[e++]=arr[i];
else
odd[o++]=arr[i];

}
System.out.println("Even Number");
for(int evenNum:even)
System.out.println(evenNum);
System.out.println("Odd Number");
for(int oddNum:odd)
System.out.println(oddNum);
}
}