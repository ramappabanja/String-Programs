
public class StringPolindromeExample {

	public static void main(String[] args) {
		checkIfPolindrome("abc");
		checkIfPolindrome("abcba");
		checkIfPolindrome("madam");
		checkIfPolindrome("level");
		checkIfPolindrome("civic");
		checkIfPolindrome("radar");
		checkIfPolindrome("refer");
		checkIfPolindrome("solos");
	}

	static void checkIfPolindrome(String str){
		int length = str.length();
		boolean result = true;
		for(int i = 0; i<length/2; i++){
			if(str.charAt(i) != str.charAt(length-1-i)){
				result = false;
				break;
			}
		}
		if(result)
			System.out.println(str+" is a polindrome");
		else
			System.out.println(str+" is not a polindrome");
	}
}
