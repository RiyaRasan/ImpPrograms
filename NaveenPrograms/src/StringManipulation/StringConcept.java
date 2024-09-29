package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		String str="Hi this is my java code";//String literals
		System.out.println(str.length());//23
		System.out.println(str.charAt(0));//H
		System.out.println(str.charAt(22));//e
		System.out.println(str.charAt(str.length()-1));
	//	System.out.println(str.charAt(23));//StringIndexOutOfBoundsException
		System.out.println(str.indexOf('H'));//0
		System.out.println(str.indexOf('i'));//1    1st occurrence of i
		System.out.println(str.indexOf('i', 2));//5  2nd occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//5   2nd occurrence of i
		System.out.println(str.indexOf('i', (str.indexOf('i', str.indexOf('i')+1))+1));//8  3rd occurrence of i
		System.out.println(str.indexOf("java"));//14
		System.out.println(str.indexOf("ruby"));//-1
		
		String msg="admin welcome";
		if(msg.indexOf("admin")>=0) {
			System.out.println("Correct");//Correct
		}else {
			System.out.println("Incorrect");
		}
		
		//trim()
		String s="   Hello        World    ";
		System.out.println(s.trim());//Hello        World
		
		//equals()
		String browser="chrome  ";
		if(browser.trim().equals("chrome")) {
			System.out.println("Launch chrome");//Launch chrome
		}
		
		//replace()
		String t="hello        world";
		System.out.println(t.replace(" ", ""));//helloworld
		System.out.println(t.replace(" ", "n"));//hellonnnnnnnnworld
		String dob="05-08-2016";
		System.out.println(dob.replace("-", "/"));//05/08/2016
		
		//replaceAll()
		String abc="Welcome   to testing     world";
		System.out.println(abc.replaceAll("\\s+", " "));//Welcome to testing world
		
		//toUpperCase()  and toLowerCase()
		String h="I am happy today";
		System.out.println(h.toUpperCase());//I AM HAPPY TODAY
		System.out.println(h.toLowerCase());//i am happy today
		
		//equalsIgnoreCase() and trim()
		String m1="chrome";
		String m2="  Chrome";
		if(m1.equalsIgnoreCase(m2.trim())) {
			System.out.println("m1 matches m2");
		}
		
		//contains()
		String main="Welcome   to testing     world";
		System.out.println(main.contains("testing"));//true
		System.out.println(main.contains("Testing"));//false
	}

}
