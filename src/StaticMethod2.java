class Employe1 {
	int salary;
	String name ;
	static String cname ;
	
	static void disp() {
		cname = "Microsoft";    // static variable value ...
		System.out.println(cname);
	}
	void input() {
		System.out.println(salary+ " "+ name + " "+cname);
	}
}
public class StaticMethod2 {

	public static void main(String[] args) {
	 Employe1 a = new Employe1();
	 Employe1 b = new Employe1();
	 a.input();
	 a.disp();
	 Employe1.cname = "ankit";
	 //a.disp();
	 a.input();   // it's value ankit   here 
     b.disp();    //disp() method gives value again Microsoft now Microsoft will be continue...
     b.input();
     a.disp();
     Employe1.disp();
	}

}
