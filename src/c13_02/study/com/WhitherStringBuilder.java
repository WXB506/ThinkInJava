package c13_02.study.com;

public class WhitherStringBuilder {
	public String implicit(String[] fields) {
		String result = "";
		for(int i=0; i<fields.length; i++)
			result += fields[i];
		
		return result;
	}
	
	public String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for(int i=0; i<fields.length; i++)
			result.append(fields[i]);
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		WhitherStringBuilder s = new WhitherStringBuilder();
		
		String[] fields = {"abc", "def", "ghi"};
		System.out.println(s.implicit(fields));
		System.out.println(s.explicit(fields));
	}
}
