package multilevelInheritance;

public class GrandparentA {
	int a=10,b=20,c;
	public void disp()
	{
		System.out.println("Method of grandparent class A");
		c=a+b;
		System.out.println("Result of multiplication "+c);
	}

}
