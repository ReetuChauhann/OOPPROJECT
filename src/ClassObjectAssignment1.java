class A{
int x=10;
String y="Rahul";
void show()
{
           System.out.println(x+y);
}
}
   class ClassObjectAssignment1  {
       public static void main(String[] args) {
     A a= new A();
    A b= new A();
a.x=15;
a.show();       //15Rahul
a.y="YoYo";
b.show();      //10Rahul
b.y="Ramu";
a.show();     // 15YoYo
b.show();     //10Ramu          every question is correct here .....
}
}

