package c09_04.study.com;

interface CanFight {
	void fight();
}
interface CanSwim {
	void swim();
}
interface CanFly {
	void fly();
}
interface CanClimb {
	void climb();
}
class Actioncharacter {
	public void fight() {
		System.out.println("fight");
	}
}
class Hero extends Actioncharacter implements CanFight, CanSwim, CanFly, CanClimb {
	public void swim() {
		System.out.println("swim");
	}
	public void fly() {
		System.out.println("fly");
	}
	public void climb() {
		System.out.println("climb");
	}
}

public class Adventrue {
	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanSwim x) {
		x.swim();
	}
	public static void v(CanFly x) {
		x.fly();
	}
	public static void w(Actioncharacter x) {
		x.fight();
	}
	public static void y(CanClimb x) {
		x.climb();
	}
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		t(hero);
		u(hero);
		v(hero);
		w(hero);
		y(hero);
	}
}
