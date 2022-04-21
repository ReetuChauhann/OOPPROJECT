class A21 {
	int x=10;
	static int y=20;
	void m1() {
		System.out.println("it is method of Parent class");
	}
	
	  static void m2() {
		System.out.println("it is static method of parent class");
	}
}
class B21 extends A21 {
	int x=15; //data hiding
	static int y=20; //data Hiding 
	
	    static void m2() { //method hiding.....
		System.out.println("it is child static method");
	}
	    void m1() {
	    	System.out.println("it is method of child class  it is method overiding .. it has change the way of doing job so it overide here....");
	    }
}
public class MethodOveridingORHiding {

	public static void main(String[] args) {
		B21 a= new B21();
		a.m2(); // method hiding ... it is ...
		System.out.println(a.x); // data hiding it is......
		System.out.println(a.y); // data hiding proved..
		a.m1(); // it is method overiding ......k
	}
}
