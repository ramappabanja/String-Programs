import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class DuplicateCharsAndCountInString {

	public static void main(String[] args) {

		String str = "Fresh Fish";
		Map<Character, Long> duplicateCharsWithCount = str.chars().mapToObj(ch->(char)ch)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream()
		.filter(entry->entry.getValue()>1 && entry.getKey()!=' ')
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->newValue, LinkedHashMap::new));
		
		System.out.println("duplicateCharsWithCount : "+duplicateCharsWithCount);
	}

}
