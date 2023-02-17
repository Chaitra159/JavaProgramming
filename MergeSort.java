import java.util.Arrays;
class MergeSort
{
public static void main(String[] args)
{
int array1[]={-10,6};
int array2[]={7,-20};
int mergeLen=array1.length+array2.length;
int merge[]=new int[mergeLen];

//For assigning array1 to merge array
System.out.println("Array 1");
for(int i=0;i<array1.length;i++)
{
System.out.println(array1[i]);
merge[i]=array1[i];
}

//To now the length of array1
int m=array1.length-1;

//for assigning array2 to merge array
System.out.println("Array 2");
for(int j=0;j<array2.length;j++)
{
System.out.println(array2[j]);
merge[++m]=array2[j];
}

//for printing merged array
System.out.println("Merged array");
for(int k=0;k<merge.length;k++)
System.out.println(merge[k]);

//for sorting array
Arrays.sort(merge);
System.out.println("Sorted array");
for(int s:merge)
System.out.println(s);


}
}