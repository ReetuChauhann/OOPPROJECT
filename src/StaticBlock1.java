class Person{
	String name;
	int age;
	static String country;
	 void disp( ) {
		 System.out.println(name+ " "+ age+ " "+country);
	 }
	 static {
		 country = "INDIA";
		 System.out.println(country);              // it is a block which executes once only.....
		 System.out.println(" our country ");     // static variable can call in this block ....
	 }
	 static void enter() {
		 country = "HINDUSTAN";            // static  variable value given again 
		 System.out.println(country);
	 }
	 
}

public class StaticBlock1 {

	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		a.disp();
		b.disp();
		Person.enter();
		a.disp();

	}

}
