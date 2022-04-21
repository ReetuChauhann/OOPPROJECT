class B1 {
	int x;
	B1(){
		System.out.println("Hello A");   //4
	}
	B1(int a){
		System.out.println("Hi A"); //2 
		x=a;
	}
	{
		System.out.println("HELLO INCAPP");  //1  //3
	}
}
public class InitializeBlock2 {

	public static void main(String[] args) {
		B1 b1=new B1(8);  
		B1 b2=new B1();

	}

}
 

//output
//HELLO INCAPP
//Hi A
//HELLO INCAPP
//Hello A