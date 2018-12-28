import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class OccurencesOfEachCharacter {

	public static void main(String[] args) {

		String str = "I am Ramappa";
		Map<Character, Long> mapOfChars = str.chars()
				.mapToObj(ch->(char)ch).filter(ch->ch!=' ')
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println("mapOfChars is : "+mapOfChars);
	}

}
