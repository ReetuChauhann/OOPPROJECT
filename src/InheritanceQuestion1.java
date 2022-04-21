class Exam1 {
	int a= 10;
	Exam1(){
		System.out.println("Hello A"+ a); //2
	}
	{
		System.out.println("Hi A"); //1
	}
}
class Exam2 extends Exam1{
	int b=20;
	Exam2(int y) {
		b=a=y;
		System.out.println("Hello B"+a+b);	
	}
	{
		System.out.println("Hi B"+a+b);
	}
}
public class InheritanceQuestion1 {

	public static void main(String[] args) {
		Exam2 y = new Exam2(5);
		System.out.println(y.a+y.b);
	}
}
//output 
//Hi A
//Hello A10
//Hi B 1020
//Hello B55
//10