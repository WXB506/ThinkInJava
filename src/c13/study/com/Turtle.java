package c13.study.com;

import java.io.*;
import java.util.*;

public class Turtle {
	private String name;
	private Formatter fmt;
	public Turtle(String name, Formatter fmt) {
		this.name = name;
		this.fmt = fmt;
	}
	
	public void move(int x, int y) {
		fmt.format("%s The Turtle is at (%d, %d)\n", name, x, y);
	}
	
	public static void main(String[] args) {
		PrintStream outAlias = System.out;
		Turtle tommy = new Turtle("Tommy", new Formatter(System.err));
		Turtle terry = new Turtle("terry", new Formatter(outAlias));
		
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
}
