public class StaticAssignment4 {
	static int x;
	int y;
	void m(int a) 
	{
	y=a;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticAssignment4.x);  // still no value provided so here x  is 0 ..
		StaticAssignment4 a = new StaticAssignment4();
		a.m(4);                                     // y is 4 here not display 
		a.x=3;                                      // x is 3 here not display 
		System.out.println(StaticAssignment4.x);    //x is 3 here
		System.out.println(a.y);                    // y is 4 here 
		System.out.println(a.x);                   // x is 3 here..............

	}

}
