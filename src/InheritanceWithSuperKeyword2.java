class AAAAA{
	public int x=10;
	AAAAA(int a){ this();
		System.out.println("Hello A");//2
	}
	
	AAAAA(){ 
		System.out.println("Hi A"); //1
	}
}

class BBBBB extends AAAAA{
	int y=20;
	BBBBB(){ super(6);
		System.out.println("Hi B"); //3
	}
	
	BBBBB(int b){ this();
		System.out.println("Hello B"); //4
	}
}

public class InheritanceWithSuperKeyword2 {
	public static void main(String[] args) {
		BBBBB b=new BBBBB(8);
	}
}
//output
//Hi A
//Hello A
//HI B
//Hello B
