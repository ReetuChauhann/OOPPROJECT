class Animal1  {
	String name;
	int age;          // we can not call these in static method......
	static int legs=4;  // we can call it in static method 
	
	void disp()  {
System.out.println(name+ " " + age  +  " " + legs ); // we can call here static or non static variable both ... 	
}
	
	static void print() {
		System.out.println("hey its static method we can call here only satatic varible ita is rule ");
		System.out.println("if we call here non static varible it will gave error ....");
		System.out.println(legs);  // its static variable it can be call here....
	//  error   	System.out.println(age);  // error because it is non-static variable we cant call non static varible in static method ....
	}
	
}
public class StaticMethod1 {

	public static void main(String[] args) {
		Animal1 a = new Animal1(); // object creation ...
		Animal1 b = new Animal1();
		Animal1.print();      // here value of legs is 4...
		a.age=100;
		b.name = "tiger ";
		a.legs=34;
	    a.disp();
	    b.print();     // static method can be call  by reference variable...
	    Animal1.print(); // static method can be call by class name also
	    
	    
		
	

	

}

}