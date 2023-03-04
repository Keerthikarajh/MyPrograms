package LogicalPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String name="madam";
		String reverseString="";
		//Convert string to char
		//First reverse the string
		//Create another empty string
		//add the reversed string with the empty string
		//compare and check
		char[] nameChar=name.toCharArray();
		for (int i=nameChar.length-1;i>=0;i--) {
			reverseString=reverseString+nameChar[i];
		}
		if (name.equalsIgnoreCase(reverseString)){
			System.out.println("Given string is a palindrome");
		}
		else
			System.out.println("Given string is not a palidrome");
	}

}
