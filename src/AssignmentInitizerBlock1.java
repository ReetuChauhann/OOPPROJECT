class EMP {
	
	String name;
	EMP(){
		System.out.println("Hello Emp"); //3    //5
		name= "Rahul ";
	}
	static{
		System.out.println("Hi Emp");    //1
		}
	
		{
		System.out.println("I am Emp");  //2   //4
		}
}
public class AssignmentInitizerBlock1 {

	public static void main(String[] args) {
		EMP e1 = new EMP();
		EMP e2 = new EMP();
		System.out.println(e1.name);	  //6 ...Rahul
	}

}
//output
//Hi Emp
//I am Emp
//Hello Emp
//I am Emp
//Hello Emp
//Rahul