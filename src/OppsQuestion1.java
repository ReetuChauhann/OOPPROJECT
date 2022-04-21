
public class OppsQuestion1 {
	static int x=10;
	String y ="Ram";
	
	static {
		x++;   // static block executes firstly ... it make x++ x is 11 here.....
	}
          OppsQuestion1() {
		 x++;          
		 System.out.println(x+y);
	} 

	public static void main(String[] args) {
		OppsQuestion1 a1 = new OppsQuestion1(); //  object creation time it will call constructor x is x++ = 12 ,  // 12Ram
		OppsQuestion1 a2 = new OppsQuestion1(); // constructor call again  x++ makes it 13..    // 13Ram
		System.out.println(a2.x);   // 13
		System.out.println(a1.y);   // Ram

	}

}
