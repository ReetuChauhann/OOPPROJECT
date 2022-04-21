class User {
	int a ;
	static int b= 200;
	void value() {
		System.out.println(a + " and " +b);
		
	}
}

public class StaticKeyword1 {

	public static void main(String[] args) {
	
     User a1 = new User();
     User a2 = new User(); 
     a1.a=500;
     a1.b=200;
     a2.a =14;
     a2.b=23;
     User.b=125; // it can be called by class name .... & refrence value .... & takes latest valaueee...
     
     a1.value();  // a=500 & b=23 because b is static it will same for all objects & it will take latestst value given to this.....
     a2.value();  //a=14 & b=23
     
     
	}

}