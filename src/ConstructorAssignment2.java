class A3 {
	static int x;
	int y;
	  A3() {
	         System.out.println("Hello");
	         x=10;
	         y=20;
	}
	  static {
		  System.out.println("Hi");  // 1 hi   because it is static block it execute class loading...
	  }
}
public class ConstructorAssignment2 {
	public static void main(String[] args) {
		A3 d1 = new A3();  //2 Hello 
		A3 d2 = new A3();  //3 Hello
		System.out.println(d1.x); //10
		System.out.println(d1.y); //20
		System.out.println(d2.x);  //10
		System.out.println(d2.y);  //20
	}
}
  //output 
  // Hi
//Hello 
//Hello
//10   ..20    10 ...20  
