class Animal {
	String name;
	private int age;
	String color;
	void input() {
		name = "satya";
		age = 21;
		
	}
	void show()  {
		System.out.println(name +"  " +age+ "  " +color);
	}
}
public class ClassObjectAsssignment2 {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Animal();
		a.show();  // it will call the show method it will take value from class animal & it is still (null  0 null).... 
		a.input();  // it will input the vaule in this method ....
		b.show();    // show value it is null still for b object ....
		b.input();   
		a.input();
		a.show();   // it  will show value here for this because a.input has given this some value to the object a 

	}

}
