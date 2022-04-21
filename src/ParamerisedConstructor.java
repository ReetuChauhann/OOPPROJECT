class Student001 {
	String name ;
	int fees;
	
	void enter() {
		System.out.println(fees + " "+name);
	}
	public Student001(int f , String n  ) {
		name = n;
		fees = f;
	} 
}
public class ParamerisedConstructor {

	public static void main(String[] args) {
	Student001 a= new Student001(456667, "satyadev");
	Student001 b = new Student001(1243575, "harsh");
    a.enter();
    b.enter();
	}
}
 // output ......
//456667 satyadev
//1243575 harsh