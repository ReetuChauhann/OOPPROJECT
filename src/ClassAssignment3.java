
public class ClassAssignment3
{
	private int x;
	public void show() {
	x++;
	System.out.println(x);
	}
	         public static void main(String[] g) {
	ClassAssignment3 a= new ClassAssignment3(); // object creation 
	a.show();    // x is 1  here 
	ClassAssignment3 b= new ClassAssignment3();  
	a.show();     // x is 2 here it will increase its value 0 to 1 than again calling 1 to 2
	b.show();   //x is 1 here
	}

}

