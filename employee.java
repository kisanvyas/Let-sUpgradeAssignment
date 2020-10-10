public class employee
{
	String name, city;
	int age;
	void display()
	{
		System.out.println("The name is "+name+ "\n The age is "+age+ "\n The city is "+city);
	}
	public static void main(String args[])
	{
		employee e1=new employee();
		e1.name="abc";
		e1.age=20;
		e1.city="Amreli";
		employee e2=new employee();
		e2.name="xyz";
		e2.age=19;
		e2.city="Bombay";
		e1.display();
		e2.display();
	}
}