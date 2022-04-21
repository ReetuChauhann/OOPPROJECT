class Apple1{
	 //static int x=10;
	int x=10;
	void m1() {
		System.out.println("Hi Apple1");                  //output for static x 
	}                                                     //15
}                                                         //HIApple1   
                                                          //15
class Apple2 extends Apple1 {                            //hiapple1
	int y=20;                                            //20
	void m2() {                                          //hiapple2
		System.out.println("Hi Apple2");
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
  Apple1 a= new Apple1();
  a.x=15;
  System.out.println(a.x);  //15
  a.m1();
  
  Apple2 b = new Apple2();
  System.out.println(b.x);
	b.m1();
	System.out.println(b.y);
	b.m2();
	}
}
//output 
//15
// Hi Apple1
//10
// Hi Apple1
//20
//HI Apple2..
