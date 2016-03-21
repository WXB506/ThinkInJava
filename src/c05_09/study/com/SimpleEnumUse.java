package c05_09.study.com;

enum Spiciness {
	NOT, MILD, MEDIUM, HOT, FLAMING
}

public class SimpleEnumUse {
	public static void main(String[] args) {
		Spiciness howHot = Spiciness.MEDIUM;	
		System.out.println(howHot);			// toString()
	}
}
