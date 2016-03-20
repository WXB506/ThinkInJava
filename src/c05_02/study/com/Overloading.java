package c05_02.study.com;

class Tree {
	int height;
	
	// default constructor, no parameter
	public Tree() {
		height = 0;
	}
	
	// constructor with parameter, overloading constructor
	public Tree(int h) {
		height = h;
	}
	
	// method overload, no-parameter
	void info() {
		System.out.println("Tree is " + height + " feet tall.");
	}
	// method overload with parameter
	void info(String s) {
		System.out.println(s + ": Tree is " + height + " feet tall.");
	}
}

public class Overloading {
	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			Tree tree = new Tree(i);
			tree.info();
			tree.info("overloading method ");
		}
		
		// overload constructor
		(new Tree()).info();
	}
}
