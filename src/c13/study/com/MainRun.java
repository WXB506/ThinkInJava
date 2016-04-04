package c13.study.com;

import java.util.Scanner;

public class MainRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pleae input true or false");
		if(sc.nextBoolean()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("input a integer : ");
		System.out.println("int value : " + sc.nextInt());
		
		System.out.println("input a integer : ");
		System.out.println("int value : " + sc.nextInt());
	}
}
