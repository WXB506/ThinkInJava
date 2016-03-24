package c07_08.study.com;

/**
 *  blank final field
 */

class Poppet {
	private int i;
	Poppet(int ii) {
		i = ii;
	}
}

public class BlandFinal {
	private final int i = 0;
	private final int j;	// blank final
	private final Poppet poppet;
	
	public BlandFinal() {
		j = 1;
		poppet = new Poppet(1);
	}
	public BlandFinal(int x) {
		j = x;
		poppet = new Poppet(1);
	}
	
	public static void main(String[] args) {
		new BlandFinal();
		new BlandFinal(47);
	}
}
