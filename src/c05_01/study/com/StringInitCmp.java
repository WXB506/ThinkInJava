package c05_01.study.com;


public class StringInitCmp {
	String s1 = "Initialize when define";
	String s2;
	
	public StringInitCmp(String s) {
		// TODO Auto-generated constructor stub
		s2 = s;
	}
	
	public static void main(String[] args) {
		StringInitCmp sp = new StringInitCmp("Initialize in constructor");
		System.out.println(sp.s1);
		System.out.println(sp.s2);
		
		StringInitCmp sp1 = new StringInitCmp(null);
		System.out.println(sp1.s1);
		System.out.println(sp1.s2);
	}
}
