
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "  Core Java jsp servlets             jdbc \n struts hibernate spring  ";
		//1. Using replaceAll() Method
		System.out.println(str.replaceAll("\\s", ""));
		
		//2. Without Using replaceAll() Method
		StringBuffer stringBuffer = new StringBuffer();
		for(char ch : str.toCharArray()){
			if(!Character.isWhitespace(ch))
				stringBuffer.append(ch);
		}
		System.out.println(stringBuffer);
	}

}
