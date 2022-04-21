class Employee1{
	String name;
	String cname;
	int salary;

	public void draw(String n , String c , int s) {
		name = n;
		cname = c;
		 salary =s;
		
	}
	
	 void dispe() {
		System.out.println(name + " "+ cname+ " "+salary);
	}

}
    public class ObjectCreation123 {

	public static void main(String[] args) {
		
		Employee1 a = new Employee1();
		Employee1 b = new Employee1();
		Employee1 c = new Employee1();
		Employee1 d = new Employee1();
		
		a.draw("rohit", "wipro", 50000);
		b.draw("sachin", "tcs", 45000);
		c.draw("shubham", "mahindra", 600000);
		d.draw("vishal", "wipro", 600000);
		
		a.dispe();
		b.dispe();
		c.dispe();
		d.dispe();
		

	}

}