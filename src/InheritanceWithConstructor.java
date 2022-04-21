class AAA{
	public int x=10;
	void m1() {
		System.out.println("Hello A");    //7
	}
	AAA(){
		System.out.println("OK A");  //4
	}
	{
		System.out.println("INCAPP A");  //3
	}
	static {
		System.out.println("Hi A");  //1
	}
}
class BBB extends AAA{
	int y=20;
	BBB(){ 
		System.out.println("OK B");  //6
	}
	{
		System.out.println("INCAPP B"); // 5
	}
	void m2() {
		System.out.println(x);   //9......10
		System.out.println("Hello B");   //10
	}
	static {
		System.out.println("Hi B");  //2
	}
}
public class InheritanceWithConstructor {
	public static void main(String[] args) {
		BBB b=new BBB();  //constructor caliing ...
		b.m1();     
		System.out.println(b.x);    //  8....10
		b.m2();    
		System.out.println(b.y); // 11....20 
	}
}
