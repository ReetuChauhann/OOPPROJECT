class Employe01  {
	String name;
	int salary;
	void show() {
		System.out.println(name+salary);
	}
	Employe01() {
		System.out.println("Hi Employee");  // 2 ..3 ..4 constructor will be call during the object creation ....
		name="Xyz Khan";
		salary=89000;
	}
	static{
		System.out.println("Hello Employee");  // 1 execute because it static block during class loading it will be execute 
	}  
}
public class ConstructorExample1 {

	public static void main(String[] args) {
		Employe01 a = new Employe01();
		Employe01 b = new Employe01();
		Employe01 c = new Employe01();
		a.show();   // 5 .. xyz khan89000 
		b.show();   // 6 .. xyz khan8900
		c.show();  // 7.. xyz khan8900
	}
}
