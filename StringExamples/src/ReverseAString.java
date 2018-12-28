
public class ReverseAString {

	public static void main(String[] args) {
		
		//1. Best Method 
		System.out.println("BEST WAY OF REVERSING A STRING : "+reverseString("Iam happy now"));
		
		//2. Using StringBuffer Class
		StringBuffer stringBuffer = new StringBuffer("MyJava");
		System.out.println("STRING REVERSING USING StringBuffer : "+stringBuffer.reverse());
		
		//3. Using iterative method
		char[] charArrey = "MyJava".toCharArray();
		for(int i=(charArrey.length-1) ; i>=0 ; i--){
			System.out.print(charArrey[i]);
		}
		
		//4. Using Recursive Method
		System.out.println("\nREVERSE OF STRING MyJava is : "+recursiveMethod("MyJava"));
	}
	
	static String reverseString(String str){
		char ch[] = str.toCharArray();
		int first = 0;
		int last = str.length()-1;
		
		for(first = 0 ; first<last ; first++,last--){
			char temp = ch[first];
			ch[first] = ch[last];
			ch[last] = temp;
		}
		
		return new String(ch);
	}
	
	static String recursiveMethod(String str){
		if( null==str || str.length()<=1)
			return str;
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}

}
