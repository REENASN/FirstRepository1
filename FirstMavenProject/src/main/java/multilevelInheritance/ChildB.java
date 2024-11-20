package multilevelInheritance;

public class ChildB extends GrandparentA {
	public void display1()
	{
		System.out.println("method of childclass B");
	}
	public static void main(String[] args) {
		ChildB obj=new ChildB();
		obj.display1();
		obj.disp();
		//System.out.println("Resut is "+c);

	}

}
