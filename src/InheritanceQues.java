class X1{
	int a=10;
	X1(){
		System.out.println("Hello A"+a); //2 Hello A 10
	}
	
	{
		System.out.println("Hi A"); //1
	}
}

class Y1 extends X1{
	int b=20;
	Y1(int y){ 
		b=a=y;
		System.out.println("Hello B"+a+b); //4 Hello B55
	}
	
	{
		System.out.println("Hi B"+a+b); //3 hi B 10 20
	}
}

public class InheritanceQues {
	public static void main(String[] args) {
		Y1 y=new Y1(5);
		System.out.println(y.a+y.b); // 5 + 5 =10
	}
}
