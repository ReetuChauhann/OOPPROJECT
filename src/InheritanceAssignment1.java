class A55{
int x;

A55() {
System.out.println("Hi A");// 1 Hi A
x=10; //10 assigned in x
}
}

class B55 extends A55{
int y;

B55() {
System.out.println("Hello B"); //2 Hello B
x=15; // 15 in x now
}

void show(){
System.out.println(x); //3//15 is x
System.out.println(y);//4 //0is y 
}
}

class  InheritanceAssignment1{
public static void main(String[] args) {
B55 b= new B55();
b.show();

}
}
//hi a
//hello b
//15
//0...
