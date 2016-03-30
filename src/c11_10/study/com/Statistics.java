package c11_10.study.com;

import java.util.*;

public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(48);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i < 10000; i++) {
			int r = rand.nextInt(20);
			Integer freq = map.get(r);
			map.put(r, freq == null ? 1 : freq+1);
		}
		System.out.println(map);
	}
}
