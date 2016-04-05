package c14.study.com;

public class GenericClassReference {
	public static void main(String[] args) {
		Class intClass = int.class;
		intClass = double.class;
		
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		//genericIntClass = double.class;
	}
}
