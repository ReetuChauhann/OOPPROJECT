
class AAAA{
	public int x=10;
	AAAA(int a){ this();
		System.out.println("Hello A");  //2
	}
	
	AAAA(){ 
		System.out.println("Hi A");  //1  
	}
}

class BBBB extends AAAA{
	int y=20;
	BBBB(){ super(6);
		System.out.println("Hi B");  //3
	}
	
	BBBB(int b){ this();
		System.out.println("Hello B");  //4
	}
}

public class InheritanceWithSuperKeyword {
	public static void main(String[] args) {
		BBBB b=new BBBB(8);
	}
}
//output...
//Hi A
//Hello A
//Hi B
//Hello B