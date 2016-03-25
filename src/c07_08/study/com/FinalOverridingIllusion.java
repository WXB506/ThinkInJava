package c07_08.study.com;

class WithFinals {
	// identical to private alone
	private final void f() {
		System.out.println("f()");
	}
	// automatically final
	private void g() {
		System.out.println("g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("FinalOverride.f");
	}
	private final void g() {
		System.out.println("FinalOverride.g");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("FinalOverride2.f");
	}
	public final void g() {
		System.out.println("FinalOverride2.g");
	}
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		OverridingPrivate op1 = op2;
		
		WithFinals wf = op1;
		
	}
}
