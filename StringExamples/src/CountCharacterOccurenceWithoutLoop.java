
public class CountCharacterOccurenceWithoutLoop {

	public static void main(String[] args) {

		String str= "Java is java again java again";
		System.out.println("str.length() : "+str.length());
		System.out.println("str.replace : "+str.replace("a", ""));
		System.out.println("str.replace length : "+str.replace("a", "").length());
		int count = str.length() - str.replace("a", "").length();
		System.out.println("count : "+count);
	}

}
