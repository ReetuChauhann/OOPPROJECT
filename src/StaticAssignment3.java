class Assignm3 {
	static int x;
	static void m() {
	x++;
	}
	static void show() {
	System.out.println(x);
	}
}
public class StaticAssignment3 {

	public static void main(String[] args) {
		System.out.println(Assignm3.x);        //x is 0 here  it will display ...
		Assignm3.m();                         // x++ increases it 0 to 1 .... it will not display 
		Assignm3.m();                        //x++ increases it 1 to 2 ..... it will not display 
		Assignm3.show();                    //x is 2 here ..... it will display ...

	}

}
