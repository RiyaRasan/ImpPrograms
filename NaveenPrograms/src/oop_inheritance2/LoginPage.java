package oop_inheritance2;

public class LoginPage extends Page {

	@Override
	public void getColor() {
		System.out.println("Login Page -- Orange color");
	}

	public void doLogin() {
		System.out.println("do login");
	}
}
