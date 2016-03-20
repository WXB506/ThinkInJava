package c05_03.study.com;

class Peeler {
	static Apple peel(Apple apple) {
		return apple;
	}
}

class Apple {
	String apple;
	
	public Apple(String s) {
		apple = s;
	}
	
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

class Person {
	public String eat(Apple apple) {
		return "Yummy";
	}
}

public class PassingThis {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.eat(new Apple("This").getPeeled()));
	}
}
