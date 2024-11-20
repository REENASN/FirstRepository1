package multilevelInheritance;

public class SubchildC extends ChildB{
	public void display2()
	{
		System.out.println("method of Subchild class C ");
	}

	public static void main(String[] args) {
		SubchildC obj= new SubchildC();
		obj.display2();
		obj.display1();
		obj.disp();
	}

}
