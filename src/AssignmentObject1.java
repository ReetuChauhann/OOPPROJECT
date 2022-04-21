class Student1 {
	String name, fathername , schoolname;
	int age , fees;
void details(String n , String fn , String sn, int a, int f )
{
	 name  = n;
	  fathername  =  fn;
	 schoolname = sn;
     age = a;
     fees = f;
}
void disp() {
	System.out.println(age + " "+ fathername+ " "+ schoolname+ " " + fees+ " "+name);
	
}
	
}
public class AssignmentObject1 {

	public static void main(String[] args) {
		
		Student1 a = new Student1();  
		Student1 b = new Student1();
		Student1 c = new Student1();
		Student1 d = new Student1();
		Student1 e = new Student1();
		
		a.details("akshay", "mr uday", "dav", 17, 5000);
		b.details("rohit", "nullkumar", "vishawashl", 14, 20000);
		c.details("ravan", "dushusnt", "dps", 19, 6000);
		d.details("karan", "mr karthik", "uuis", 15, 6000);
		e.details("savan", "mr natwarlal", "sgrrs", 21, 7000);
		
		
		a.disp();
		c.disp();
		b.disp();
		e.disp();
		d.disp();
		a.disp();
		a.disp();
		
	}

}
