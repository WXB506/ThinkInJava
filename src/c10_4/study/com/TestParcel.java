package c10_4.study.com;

class Parcel4 {
	private class PContents implements Contents{
		private int i = 11;
		
		public int value() {
			return i;
		}
	}
	
	protected class PDestination implements Destination {
		private String label;
		
		private PDestination(String whereTo) {
			label = whereTo;
		}
		
		public String readLable() {
			return label;
		}
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	
	public Contents contents() {
		return new PContents();
	}
}

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		
		System.out.println(c.value());
		System.out.println(d.readLable());
	}
}
