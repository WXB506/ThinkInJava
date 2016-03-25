package c08_02.study.com;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for(int i=0; i < 9; i++)
			s[i] = gen.next();
		
		for(Shape shape : s) 
			shape.draw();
	}
}
