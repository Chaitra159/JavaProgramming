class Diamond
{
public static void main(String[] args)
{
int star=1;
int space=2;
for(int i=1;i<=3;i++)
{
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
for(int k=1;k<=star;k++)
{
System.out.print("* ");
}
System.out.println();
star++;
space--;
}
star=2;space=1;
for(int i=2;i>=1;i--)
{
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
for(int k=1;k<=star;k++)
{
System.out.print("* ");
}
System.out.println();
star--;
space++;
}

}
}