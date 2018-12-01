import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DuplicateWordsInString {

	public static void main(String[] args) {

		String string = "java is java again is java";
		List<String> stringList = Stream.of(string.split(" "))
				.collect(Collectors.toList());
		Set<String> duplicateList = stringList.stream()
		.filter(str->stringList.indexOf(str)!=stringList.lastIndexOf(str))
		.collect(Collectors.toSet());
		System.out.println("duplicateList is : "+duplicateList);
	}

}
