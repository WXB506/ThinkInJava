package c11_03.study.com;

import java.util.*;

class Snow {}
class Powder extends Snow {}
class Crusty extends Snow {}
class Slush  extends Snow {}
class Light  extends Powder {}
class Heavy  extends Powder {}

public class AsListInterface {
	public static void main(String[] args) {
		List<Snow> snows1 = Arrays.asList(new Powder(), new Crusty(), new Slush());
		List<Snow> snows2 = Arrays.asList(new Light(),  new Heavy());	// won't compile
		List<Snow> snows3 = new ArrayList<Snow>();
		Collections.addAll(snows3, new Light(), new Heavy());
		List<Snow> snows4 = Arrays.<Snow>asList(new Light(), new Heavy());
		
		System.out.println(snows1);
		System.out.println(snows2);
		System.out.println(snows3);
		System.out.println(snows4);
	}
}
