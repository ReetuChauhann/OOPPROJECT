class Adition {
	void add(int a , int b) {
		int r = a+b;
		System.out.println("Addition of two number :" +r);
	}
	
	void add(double a , double b) {
		double r = a+b;
		System.out.println("sum:" +r);
	}
	
	void add(String a, String b) {
		String r =  a+b;
		System.out.println("concatination:" +r);
	}
}
	
	public class CompileTimePoymorphism {

	public static void main(String[] args) {
        
		Adition a= new Adition();
		
		a.add(12.5, 11.9);
		a.add("Satyadev", "Saini");
		a.add(123, 456);

	}

}
