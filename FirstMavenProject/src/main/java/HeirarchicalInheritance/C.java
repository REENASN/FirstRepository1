package HeirarchicalInheritance;

public class C extends A{
	public void disp2()
	{
	System.out.println("Method of class C");
	}
	
	public static void main(String args[])
	{
		C obj=new C();
		obj.disp2();
		obj.disp();
		System.out.println(obj.a);
	}

	

}
