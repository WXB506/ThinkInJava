package c08_03.study.com;

class Characteristic {
	private String s;
	
	Characteristic(String s) {
		this.s = s;
		System.out.println("Characteristic.");
	}
	protected void dispose() {
		System.out.println("Characteristic " + s);
	}
}

class Description {
	private String s;
	
	Description(String s) {
		this.s = s;
		System.out.println("Description.");
	}
	protected void dispose() {
		System.out.println("Description " + s);
	}
}

class LivingCreatrue {
	private Characteristic p = new Characteristic("is alive.");
	private Description    d = new Description("Basic Living Creature.");
	
	LivingCreatrue() {
		System.out.println("LivingCreature dispose.");
	}
	protected void dispose() {
		d.dispose();
		p.dispose();
		System.out.println("LivingCreature dispose.");
	}
}

class Animal extends LivingCreatrue {
	private Characteristic p = new Characteristic("has heart.");
	private Description    d = new Description("Animal not Vegetable.");
	
	Animal() {
		System.out.println("Animal");
	}
	protected void dispose() {
		d.dispose();
		p.dispose();
		super.dispose();
		System.out.println("Animal dispose.");
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description    d = new Description("Both water and land.");
	
	Amphibian() {
		System.out.println("Amphibian");
	}
	protected void dispose() {
		d.dispose();
		p.dispose();
		super.dispose();
		System.out.println("Amphibian");
	}
}

public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description    d = new Description("Eats Bugs.");
	
	public Frog() {
		System.out.println("Frog");
	}
	protected void dispose() {
		d.dispose();
		p.dispose();
		super.dispose();
		System.out.println("Frog");
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("BYE!");
		frog.dispose();
	}
}
