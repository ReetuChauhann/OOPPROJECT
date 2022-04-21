class Assign2 {
	int x = 10;
	static int y =20;
	void show() {
		System.out.println(x);
		System.out.println(y);
	}
}
public class StaticAssignment2 {

	public static void main(String[] args) {
		
		Assign2 d1 = new Assign2();
		Assign2 d2 = new Assign2();
		Assign2 d3 = new Assign2();
		
		d1.x=20; d1.y=30;
		d2.x=40; d2.y=50;
		d3.x=60; d3.y=70;
		d1.show();  // x = 20 it will same .... y = 70 beccause in last final value of y is 70...
		d2.show();  // x = 40 & y = 70....
		d3.show();  // x = 60  & y = 70 here

	}

}
