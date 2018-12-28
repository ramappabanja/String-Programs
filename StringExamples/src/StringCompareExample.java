
public class StringCompareExample {

	public static void main(String[] args) {
		String str = "We are comparing the content with a StringBuffer content";
		StringBuffer sb = new StringBuffer("We are comparing the content with a StringBuffer content");
		
		if(str.contentEquals(sb))
			System.out.println("The Content is equal");
		else
			System.out.println("The Content is NOT equal");
		
		StringBuffer sb2 = new StringBuffer("You cannot compare the content with a String content");
		if(str.contentEquals(sb2))
			System.out.println("The Content is equal");
		else
			System.out.println("The Content is NOT equal");
	}

}
