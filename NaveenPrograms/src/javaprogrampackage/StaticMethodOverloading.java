package javaprogrampackage;

public class StaticMethodOverloading {

	public static void printLogo(int i) {
		printLogo(i, 20);
	}

	public static void printLogo(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String args[]) {

		StaticMethodOverloading.printLogo(50);
	}
}
