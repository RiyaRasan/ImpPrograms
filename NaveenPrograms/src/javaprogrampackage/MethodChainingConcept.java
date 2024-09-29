package javaprogrampackage;

public class MethodChainingConcept {

	public void m1(int i) {
		m2(i);
	}

	public void m2(int k) {
		m3(k);
	}

	public void m3(int p) {
		System.out.println("bye: " + p);
	}

	public static void main(String[] args) {
		MethodChainingConcept obj = new MethodChainingConcept();

		obj.m1(10);

	}

}
