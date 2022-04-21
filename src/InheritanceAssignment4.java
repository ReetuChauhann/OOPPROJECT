
class A88{
int x=10;
A88() {
System.out.println("Hi A");  //1  //4
}

A88(int a) {
this();
System.out.println("Hello A");  //2
x=a;  // assign x is 5 in obj b..
}
}

class B88 extends A88{
int y;
B88() {
super(5);
System.out.println("Hi B"); //3
}


B88(int b) {
x=y=b; // x & y value is same here  5
System.out.println("Hello B"); //5 
}
}

class InheritanceAssignment4{
public static void main(String[] args) {
B88 b= new B88();
B88 b2= new B88(5);
System.out.println(b.x+"\t"+b.y); //6 //5is x  0 for y   //5  0 
System.out.println(b2.x+"\t"+b2.y); //7 // x=5 & y=5  //5  5
}
}
// Hi A
//Hello A
//Hi B
//Hi A
//Hello B
//5 0
//5 5