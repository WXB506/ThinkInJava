package c08_03.study.com;

import java.util.zip.CheckedInputStream;

class Meal {
	Meal() {
		System.out.println("Meal");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread");
	}
}

class Chesse {
	Chesse() {
		System.out.println("Chesse");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortabelLunch");
	}
}

public class Sandwich extends PortableLunch {
	private Bread bread = new Bread();
	private Chesse chesse = new Chesse();
	private Lettuce lettuce = new Lettuce();
	
	public Sandwich() {
		System.out.println("Sandwich");
	}
	
	public static void main(String[] args) {
		new Sandwich();
	}
}
