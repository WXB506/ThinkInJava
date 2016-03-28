package c10_07.study.com;

import c10_07.study.com.Parcel11b.Test.Test2;

public class Parcel11b {
	public class Test {
		int i;
		Test(int i) {
			this.i = i;
		}
		public int getI() {
			return i;
		}
		
		public class Test2 {
			String s;
			Test2(String s) {
				this.s = s;
			}
			public String getS() {
				return s;
			}
		}
	}
	
	public static void main(String[] args) {
		Parcel11b parcel11b = new Parcel11b();
		Test test = parcel11b.new Test(19);
		Test2 test2 = test.new Test2("fuck");
		System.out.println(test.getI());
		System.out.println(test2.getS());
	}
}
