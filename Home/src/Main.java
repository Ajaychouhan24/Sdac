interface A {

	abstract void meth3();
	int a = 32;
	String name = "Ajay";
	
}

class B implements A {

	public void meth3() {
		System.out.println();
		System.out.println(a+name);
		System.out.println(name);
		

	}
}

public class Main {
	public static void main(String[] args) {
		
		B b = new B();
		b.meth3();
		
		
	}
}