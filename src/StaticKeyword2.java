class Employee {
	String name ;
	int salary ;
	 static String cname;
	 void input(String n , int sal) {
		 name = n;
		 salary = sal;
		 
	 }
	 
	 void disp() {
		 System.out.println(name + " "+salary+" "+cname);
	 }
}
public class StaticKeyword2 {

	public static void main(String[] args) {
		Employee a =new  Employee();
		Employee b =new  Employee();
		Employee c =new  Employee();
		Employee d =new  Employee();
		a.cname="wipro";  // static varible call by the object refrence 
		Employee.cname = "Google"; // it can call by the class name ..... 
		a.input("satya", 45000);
		b.input("dgahg", 67000);
		c.input("dsga", 56900);
		a.disp();
		b.disp();
		c.disp();
		d.disp();
		
		
		
	

	}

}
