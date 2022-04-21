
public class privateKeyword1 {
	// name , cname, salary ....
	
	private int salary ;
	private String cname;
	private String name;
	
	void input(String n , String cn , int sal) {
		salary =sal;
		name = n;
		cname = cn;
		
	}
	
	void show() {
		System.out.println(name + " " +cname+ " "+salary);
	}
}
class Xyz  {
	

	public static void main(String[] args) {
		
		privateKeyword1 a = new privateKeyword1();
		privateKeyword1 b = new privateKeyword1();
		privateKeyword1 c = new privateKeyword1();
	  // 	a.salary = 120;  errror here because it is private can be used in its class only ...not accessable outside the class 
	
		a.input("ashu", "etx", 50000);
		b.input("anuj", "xyz", 60000);
		c.input("avinash", "wiptg", 100000);
		a.show();
		b.show();
        c.show();
	}

}
