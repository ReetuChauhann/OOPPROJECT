class AA{
	private int x=10;
	void show() {
		System.out.println(x);
	}
	
	public int h=30;
	void m1() {
		System.out.println("Hello A");
	}
}

class BB extends AA{
	int y=20;
	void m2() {
		System.out.println("Hello B");
	}
}

public class InheritanceWithPrivate1 {
	
	public static void main(String[] args) {
		BB b=new BB();
		b.m1();
		System.out.println(b.h);
		//System.out.println(b.x);//error because x is private cannot access by the object of another class  
		b.show();
		b.m2();
		System.out.println(b.y);
	}
}
//output
//hello a 
//30
//10
//hello B
//20