class A5  {
	int x;
	static int y;
	 A5(){
		System.out.println("Hi A");//4
	}
	A5(int a) {
		System.out.println("Hello A");  //6
		x=a;   //value is 4 here
	}
	static{
		y=15; //value assigned
		System.out.println("Class Loaded");   //1
		}
		{
		System.out.println("Object Created");  //3 //5
		}
}
public class AssignmentInitizerBlock2 {
	public static void main(String[] args) {
		
		System.out.println(A5.y);   //2 y=15.. 
		A5 a= new A5();
		A5 a2= new A5(4);
		System.out.println(a.x);    //7  ...0 
		System.out.println(a2.x);   //8 ...4
	}
}
//output
//Class Loaded
//15
//Object Created
//Hi A
//Object Created
//Hello A
//0
//4