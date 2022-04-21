class B {
	String x;
	int y=5;
	void show() {
		System.out.println(x+y);	
	}
	B(){
		System.out.println("Hello");  //1..Hello
		x="ram"; y=10;                //value assign of x & y...
		show();                       //2. ram10  because it calls show method here
	}
	
	B(String a,int b){
		this();
		System.out.println("Hi");   // 3.Hi
		x=a;                         // value get tina in x & 20 in y
		y=b;
	}
}
public class ConstructorChainingQuestion1 {

	public static void main(String[] args) {
	B a = new B("tina",20);  //constructor calling .....
	a.show();                //4.Tina20
	}
}
  
//output
//Hello
//ram10
// Hi
//Tina20