class A77{
int x=10;
A77() {
System.out.println("Hi A");  //1   //4
}

A77(int a) {
this();
System.out.println("Hello A"); //5
x=a; // assign 3 is in a object here 
}
}

class B77 extends A77{
B77(int b) {
x=b;  //x is 5 here in b object ...
System.out.println("Hi B");    //2
}
}

class InheritanceAssignment3 {
public static void main(String[] args) {
B77 b=new B77(5);
System.out.println(b.x); //3  // x is 5 here

A77 a=new A77(3);
System.out.println(a.x); //6 // x is 3 here 
}
}
//output
//HI A
//Hi B
//5
//HI a
//Hello A
//3