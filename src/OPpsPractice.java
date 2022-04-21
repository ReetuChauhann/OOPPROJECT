  class Demo01{
	  
	   void m () {
			 System.out.println("hello employeee");
		 }
	   int x=100;
	     static int n=1000;
	     public int p=1000;
		 private String name;
		 private int salary =90000;
		 private String cname;
		 
		 void input(String n ,String c ,int s) {
			  name = n;
			  salary = s;
			  cname = c;
		  }
		  void show() {
			  System.out.println(name+ " "+salary+" "+cname);
		  }
   }
 class OPpsPractice{
 static int x=10;
 int q=5000;
public static void main(String[] args) {
	
	
    //System.out.println(name); it is private from another class ...	
	
	Demo01 a= new Demo01();
	Demo01 b= new Demo01();
	Demo01 c= new Demo01();
	
	//x=120;
	System.out.println(x); //120 it is static member.......
	a.input("Ankur", "wps", x);
	
	a.show();
	System.out.println(x);
	//a.input("ankit", "aws", q);
	//a.show();
	
	//a.input("hsjhj", "pqr", n);
	
  } 

 }