package OverloadingMethod;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     arithmeticOp(10,20);
     arithmeticOp(10.1, 20.23);
	}
	public static int arithmeticOp(int a,int b)
	{
		System.out.println("Addition for int:"+(a+b));
		System.out.println("Subtraction for int:"+(a-b));
		System.out.println("Division for int:"+(a/b));
		System.out.println("Multiplication for int:"+(a*b));
		return 0;
	}
	public static double arithmeticOp(double a,double b)
	{
		System.out.println("Addition for double:"+(a+b));
		System.out.println("Subtraction for double:"+(a-b));
		System.out.println("Division for double:"+(a/b));
		System.out.println("Multiplication for double:"+(a*b));
		return 0;
	}

}
