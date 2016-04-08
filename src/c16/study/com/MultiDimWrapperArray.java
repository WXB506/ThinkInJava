package c16.study.com;

import java.util.*;

public class MultiDimWrapperArray {
	public static void main(String[] args) {
		Integer[][] a1 = {
				{1,2,3},
				{4,5,6}
		};
		Double[][][] a2 = {
				{{1.1,1.2},{2.2,2.3}},
				{{1.3,1.4},{2.4,2.5}}
		};
		
		System.out.println(Arrays.deepToString(a1));
		System.out.println(Arrays.deepToString(a2));
	}
}
