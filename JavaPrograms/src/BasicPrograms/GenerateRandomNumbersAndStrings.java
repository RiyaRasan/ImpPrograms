package BasicPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
//		In OATS
//		getVariables().set("min","600000000");
//		getVariables().set("max","990000000");
//		getVariables().set("random","{{@random({{min}},{{max}})}}");
//		String timeStamp= eval("{{random}}").substring(0, 4)+ String.valueOf(System.currentTimeMillis());
		
		
		//Approach 1- Using Random class
		Random r= new Random();
		int randomIntNum=r.nextInt(10); //Minimum limit=0, Maximum limit=999         here 0<=randomNumber<10
		System.out.println(randomIntNum);//8
		
		double randomDblNum=r.nextDouble();//here 0.0<=randomNumber<1.0
		System.out.println(randomDblNum);//0.05556758388240657
		
		//Approach 2 - Using Math class
		System.out.println(Math.random());//Generates decimal random number like 0.46869416718850265
		
		//Approach 3 - Using commons-lang3-3.12.0  JAR
		String randomNum=RandomStringUtils.randomNumeric(5);
		System.out.println("randomNum using JAR: "+ randomNum);
		
		String randomStr=RandomStringUtils.randomAlphabetic(10);
		System.out.println("randomStr using JAR: "+ randomStr);
	}

}
