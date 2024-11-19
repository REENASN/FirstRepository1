package Mavenproject;

public class Examplemaven {

	public static void main(String[] args) {
		//append method
				StringBuffer news1=new StringBuffer("hello");
				news1.append(" java");
				System.out.println(news1);
				
				//insert method
				StringBuffer news2=new StringBuffer("Saira");
				news2.insert(1, "Afzal");
				System.out.println(news2);
				
				//reverse method
				StringBuffer news3=new StringBuffer("Saira");
				news3.reverse();
				System.out.println(news3);
				
				//delete method
				StringBuffer news4=new StringBuffer("Saira");
				news4.delete(0,2);
				System.out.println(news4);
				
				//replace method
				StringBuffer news5=new StringBuffer("Sairamol");
				news5.replace(1,5,"Reena");
				System.out.println(news5);// TODO Auto-generated method stub

	}

}
