package c16.study.com;

import java.util.*;

public class ArrayOptions {
	public static void main(String[] args) {
		// arrays of objects
		BerylliumSphere[] a;
		a = new BerylliumSphere[] {
				new BerylliumSphere(), new BerylliumSphere()
		};
		System.out.println("a: " + a);
		
		BerylliumSphere[] b = new BerylliumSphere[5];
		System.out.println("b: " + Arrays.toString(b));
		
		BerylliumSphere[] c = new BerylliumSphere[5];
		for(int i=0; i<c.length; i++)
			if(c[i] == null)
				c[i] = new BerylliumSphere();
		System.out.println("c: " + Arrays.toString(c));
		
		BerylliumSphere[] d = {
				new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()
		};
		System.out.println("d: " + Arrays.toString(d));
		
		System.out.println("a = " + a.length);
		System.out.println("b = " + b.length);
		System.out.println("c = " + c.length);
		System.out.println("d = " + d.length);
		
		// arrays of primitives
		int[] e;
		int[] f = new int[5];
		System.out.println("f: " + Arrays.toString(f));
		
		int[] g = new int[4];
		for(int i=0; i<4; i++)
			g[i] = i*i;
		System.out.println("g: " + Arrays.toString(g));
		
		int[] h = { 11, 12, 13, 14 };
		System.out.println("h: " + Arrays.toString(h));
		
		//System.out.println("e = " + e.length);
		System.out.println("f = " + f.length);
		System.out.println("g = " + g.length);
		System.out.println("h = " + h.length);
		
		e = h;
		System.out.println("e : " + Arrays.toString(e));
		System.out.println("e = " + e.length);
	}
}
