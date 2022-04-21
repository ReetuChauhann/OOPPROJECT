class Ele1 {
	String name;
	int age;
	 void show() {
		 System.out.println(name+ " "+age);
	 }
	 Ele1(){
		 System.out.println("Hello");   //1
	 }
	 Ele1(String n) {
		 this();
		 System.out.println("OK");      //2
		 name = n;                       //hhh value is here
	 }
		 Ele1(String n , int a) {
			 this("hhh");                  
			 System.out.println("Hi");  //3
			 name = n;                    // here n is x so again it will got x here //x             
			 age =a;
		 }
	 }
public class ConstructorChaining2 {

	public static void main(String[] args) {
		Ele1 a = new Ele1("x",10);
		a.show();

	}

}

//output...
//Hello
//Ok
//Hi
//x 10
