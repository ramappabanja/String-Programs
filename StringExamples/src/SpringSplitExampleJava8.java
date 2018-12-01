import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SpringSplitExampleJava8 {

	public static void main(String[] args) {

		//split a dot(.) separated String into a list of String
		String str = "Aabc.123.xyzZ";
		List<String> stringList = Stream.of(str.split("\\.")) // need to use escape character to split a string by '.'
		.map(ele->(String)ele).collect(Collectors.toList());
		System.out.println("stringList : "+stringList);
		
		//splitting the string using Pattern
		String names = "ram,raja,siva,vinodh";
		Pattern pattern = Pattern.compile(",");
		pattern.splitAsStream(names).forEach(System.out::println);
		
		//String Array to Map
		String[] programming_languages = new String[] {"language:java","os:linux","editor:emacs"};
		Map<String, String> resultMap = Stream.of(programming_languages).map(str1->str1.split(":"))
		.collect(Collectors.toMap(strArray->strArray[0], strArray->strArray[1]));
		System.out.println("resultMap is : "+resultMap);
		
//		convert a String to a Character list using the Stream API
		List<Character> listOfChars = str.chars()
				.mapToObj(ch->(char)ch)
				.collect(Collectors.toList());
		System.out.println("listOfChars : "+listOfChars);
		
	}
}
