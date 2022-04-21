class Animal01 {
	int age ;
	String name;
	void disp() {
		System.out.println(name + " " + age);
	}
	public Animal01(int a, String n ) {
   		age =a;
   		name = n;
   		System.out.println(" it is parameterised in the overloading ");
   		System.out.println(name + " " + age);
	}
	public Animal01() {
	System.out.println(" it is a constructor ");
	System.out.println(name + " " + age);
	
	}
}
public class ConstructorOverloading1 {

	public static void main(String[] args) {
		Animal01 a = new Animal01(34,"dog");
		Animal01 b = new Animal01();
		Animal01 c = new Animal01(14,"elephant");
		a.disp();
		b.disp();
		c.disp();
	}	
}
//output
//it is parameterised in the overloading
//dog 34
// it is a constructor
//null 0
//it is parameterised in the overloading
//elephant 14
//dog 34 
//null 0
//elephant 14