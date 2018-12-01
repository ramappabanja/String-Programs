
public class ReverseAString {

	public static void main(String[] args) {
		//1. Using StringBuffer Class
		StringBuffer stringBuffer = new StringBuffer("MyJava");
		System.out.println("STRING REVERSING USING StringBuffer : "+stringBuffer.reverse());
		
		//2. Using iterative method
		char[] charArrey = "MyJava".toCharArray();
		for(int i=(charArrey.length-1) ; i>=0 ; i--){
			System.out.print(charArrey[i]);
		}
		
		//3. Using Recursive Method
		System.out.println("\nREVERSE OF STRING MyJava is : "+recursiveMethod("MyJava"));
	}
	
	static String recursiveMethod(String str){
		if( null==str || str.length()<=1)
			return str;
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}

}
