package StringPrograms;

public class SortString {

	public static void main(String[] args) {
		String str = "asdRWAHJ876";
	    System.out.println("Before Sorting:" + str);
	   
	    char temp = 0;
	    char[] charArray = str.toCharArray();
	    
	    for(int i=0; i < charArray.length; i++) {
	    	for(int j=0; j < charArray.length; j++) {
	          if(charArray[j] > charArray[i]) {
	             temp = charArray[i];
	             charArray[i] = charArray[j];
	             charArray[j] = temp;
	          }
	       }
	    }
	    System.out.print("After Sorting:");
	    for(char value:charArray) {
	       System.out.print(value);
	    }
	 }
}
