package c10_07.study.com;

import c10_4.study.com.Contents;
import c10_4.study.com.Destination;

public class Parcel11 {
	private static class PracelContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	protected static class ParcelDestination implements Destination {
		private String label;
		private ParcelDestination(String whereTo) {
			label = whereTo;
		}
		public String readLable() {
			return label;
		}
		public static void f() {
		}
		static int x = 10;
		static class AnotherLevel {
			public static void f() {
			}
			static int x = 10;
		}
	}
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	public static Contents contents() {
		return new PracelContents();
	}
	
	public static void main(String[] args) {
		Contents contents = contents();
		Destination destination = destination("FUCK");
		System.out.println(contents.value());
		System.out.println(destination.readLable());
	}
}
