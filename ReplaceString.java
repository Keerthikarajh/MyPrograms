package LogicalPrograms;

public class ReplaceString {
	public static void main(String[] args) {
		String data="Chennai 600048";
		String number=data.replaceAll("[^0-9]", "");
		System.out.println(number);
		//To convert String to integer
		int parseInt=Integer.parseInt(number);
		System.out.println(parseInt);
		String text=data.replaceAll("[^a-zA-Z]", "");
		System.out.println(text);
	}

}
