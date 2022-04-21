  class A66{
int x;
A66() {
this(2);
System.out.println("Hi A"); // 2  Hi A
}

A66(int a) {
x=a;  // x is 2 here 
System.out.println("Hello A"); //1 Hello A
}
}
  
class B66 extends A66{
B66() {
System.out.println("Hi B"); //3 Hi B
}
}

class InheritanceAssignment2 {
public static void main(String[] args) {
B66 b=new B66();
System.out.println(b.x); //4// x is 2 here...

}
}
//hello A
//hi a
//HI b 
//2..
