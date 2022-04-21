class Ab{
	int x;
	Ab(){
		System.out.println("Hello A"); //3  //6   //9
	}
	{
		System.out.println("Hi1"); //1   //4    //7
	}
	{
		System.out.println("Hi2"); //2 //5  //8
	}
}
public class InitializeBlock1 {
	public static void main(String[] args) {
       
		Ab a = new Ab(); // constructor calling ...
		Ab b = new Ab();
		Ab c = new Ab();
	}
}
//output
//Hi1
//Hi2
//Hello A
//Hi1
//Hi2
//Hello A
//Hi1
//Hi2
//Hello A