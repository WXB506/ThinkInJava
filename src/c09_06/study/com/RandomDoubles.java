package c09_06.study.com;

import java.util.Random;

public class RandomDoubles {
	private static Random rand = new Random(47);
	public double next() {
		return rand.nextDouble();
	}
	
	public static void main(String[] args) {
		RandomDoubles rd = new RandomDoubles();
		for(int i=0; i<47; i++) {
			System.out.println(rd.next());
		}
	}
}
