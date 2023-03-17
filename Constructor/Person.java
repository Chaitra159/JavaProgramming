/*Write a program that implements a Person class with overloaded constructors
 *  that accept different combinations of name, age, and address. 
 *  Test the class by creating multiple Person objects with different constructor 
 *  parameters.*/
package Constructor;
public class Person {
	String name,address;
	int age;
Person(String name)
{
	this.name=name;
	System.out.println("Name:"+name);
}
Person(String name, int age)
{
	this.name=name;
	this.age=age;
	System.out.println("Name:"+name+"Age:"+age);
}
Person(String name, int age, String address)
{
	this.name=name;
	this.age=age;
	this.address=address;
	System.out.println("Name:"+name+"Age:"+age+"Address:"+address);
}
}

