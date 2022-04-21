class A01 {
	int x = 10;
	String y ="Rahul";
	A01() {
		x =12;
		System.out.println("Hi");
	}
}
public class ConstructorAssignment1 {

	public static void main(String[] args) {
		A01 a = new A01();   // constructor calling   // Hi
		System.out.println(a.x); //12 
		System.out.println(a.y); // Rahul 
	}
}
         //output
   //Hi 
   //12
   //Rahul