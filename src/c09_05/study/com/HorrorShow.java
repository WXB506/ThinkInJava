package c09_05.study.com;

interface Monster {
	void menace();
}
interface DangerousMonster extends Monster {
	void destroy();
}
interface Lethal {
	void kill();
}

class Dragonzilla implements DangerousMonster {
	public void menace() {
		System.out.println("Dragonzilla");
	}
	public void destroy() {
		System.out.println("Dragonzilla");
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
		System.out.println("menace");
	}
	public void destroy() {
		System.out.println("destroy");
	}
	public void kill() {
		System.out.println("kill");
	}
	public void drinkBlood() {
		System.out.println("drinkBlood");
	}
}


public class HorrorShow {
	static void u(Monster x) {
		x.menace();
	}
	static void v(DangerousMonster x) {
		x.menace();
		x.destroy();
	}
	static void w(Lethal x) {
		x.kill();
	}
	
	public static void main(String[] args) {
		DangerousMonster barney = new Dragonzilla();
		u(barney);
		v(barney);
		
		System.out.println();
		
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}
