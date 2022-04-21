class Employee0{
	private String name;  // it is private only calls inside the class...
	private int salary;
	static private String cname;
	static void display() {
		System.out.println("Hello Employee");  //4
	}
	static {
		System.out.println("Hi Employee");  //3
	}
}
public class StaticMostImportantQuestion {

	public static void main(String[] args) {
		System.out.println("Hello Main"); //2
		Employee0.display();
	}
	static {
		System.out.println("Hello INCAPP"); // 1 
	}
}

                         // output 

   //Hello INCAPP
  //Hello Main 
 //Hi Employee
//Hello Employee