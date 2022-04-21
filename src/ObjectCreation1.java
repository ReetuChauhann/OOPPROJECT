 class Employe   {
	String name;
	int salary;
	String cname;
}
public class ObjectCreation1 {
	
	public static void main(String[] args) {
	
	Employe a =	    new Employe(); // its object creation ..... in java ....
	Employe b = 	new Employe(); // object createdd in java 
	Employe d =     new Employe(); 
	
	System.out.println(a.name + " " + a.salary + " "+ a.cname);
	System.out.println(b.salary + " "+b.name + " "+b.cname );
    System.out.println(d.cname+ " "+ d.name+ " "+d.salary);
    
    a.name = "sachin";   
    a.salary =10000;
    a.cname = "sd";
    b.cname="rn";
    b.name = "rohit";
    b.salary = 1500000;
    d.cname="kfjk";
    d.name="raju";
    d.salary=120000;
    
    System.out.println(a.name + " " + a.salary + " "+ a.cname);
	System.out.println(b.salary + " "+b.name + " "+b.cname );
    System.out.println(d.cname+ " "+ d.name+ " "+d.salary);
    

	
		

	}

}
