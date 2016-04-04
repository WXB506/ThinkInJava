package c14.study.com;

class Candy {
	static {
		System.out.println("Loading Candy...");
	}
}
class Gum {
	static {
		System.out.println("Loading Gum...");
	}
}
class Cookie {
	static {
		System.out.println("Loading Cookie...");
	}
}

public class SweetShop {
	public static void main(String[] args) {
		
		new Candy();
		System.out.println("After creating Candy...\n");
		
		try {
			//Class.forName("Gum");					// failed
			Class.forName("c14.study.com.Gum");	// succeed
		} catch(ClassNotFoundException e) {
			System.out.println("Couldn't find Gum...");
		}
		System.out.println("After Class.forName(\"Gum\")\n");
		
		new Cookie();
		System.out.println("After creating Cookie...");
	}
}
