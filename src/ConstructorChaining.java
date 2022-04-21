class Ele {
	String name ;
	int age;
	void show(){
		System.out.println(name + " "+age);
	}
	Ele(){
		//this(100 );   //1
		this(500 ,"rakshash");  //2
		System.out.println(" hey elephant ");
	//	this(500 ,"rakshash");    // it will be error here constructor call will be first statement...
	}
	Ele (int a){
		age = a;
		System.out.println(" elephant with one argument ");
	}
	Ele (int a , String n){
		age =a;
		name = n;
		System.out.println(" proper powered Elephant ");
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		Ele a = new Ele();
		a.show();

	}
}
//output1
//elephant with one argument
//hey elephant
// null 100

//output2
// proper powered Elephant
//hey elephant 
// rakshash 500