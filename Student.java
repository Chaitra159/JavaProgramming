class Student
{
public static void main(String[] args)
{
int Tmarks=85;
if(Tmarks<35)
System.out.println("Fail");
else if((Tmarks>=35)&&(Tmarks<50))
System.out.println("D grade");
else if((Tmarks>=50)&&(Tmarks<60))
System.out.println("C grade");
else if((Tmarks>=60)&&(Tmarks<75))
System.out.println("B grade");
else if((Tmarks>=75)&&(Tmarks<85))
System.out.println("A grade");
else if((Tmarks>=85)&&(Tmarks<=100))
System.out.println("Distinction");
else
System.out.println("Not a valid number");
}
}