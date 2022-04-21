class D{
	private int x=10;
	static String y;
	void show() {
		System.out.println(x+y);       //9 ... //10
	}
	D(){
		System.out.println("Hi D"); //5   //8
	    x=20; y="yoyo";//value assign...   value assign
	}
	{
		System.out.println("OK D"); //3  //6
		System.out.println(x+y);   //4    //7
	   
	}
	
	static {
		System.out.println("Hello D");  //1 
	}
	static void display() {
		System.out.println("INCAPP"); //2
	}
}
public class OOPQues1 {
	public static void main(String[] args) {
		D.display();
		D d=new D();
		D d2=new D();
		d.show();
		d2.show();
	}
}
//output
//Hello D
//INCAPP
//OK D
//10Null
//Hi D
//OK D
//10yoyo because d2 object value is 10 or yoyo(static) ......
//Hi D
//20yoyo
//20yoyo