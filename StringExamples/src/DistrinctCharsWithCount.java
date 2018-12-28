import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class DistrinctCharsWithCount {

	public static void main(String[] args) {
		charsCountOfString("abc");
		printDistinctCharsWithCount("abc");
		charsCountOfString("abcab3");
		printDistinctCharsWithCount("abcab3");
		charsCountOfString("hi there, i am ram");
		printDistinctCharsWithCount("hi there, i am ram");
	}

	static void charsCountOfString(String  str){
		Map<Character, Integer> map = new HashMap<>();
		
		str.chars().mapToObj(ch->(char)ch)
		.collect(Collectors.toList())
		.forEach(chr->{
			map.put(chr, map.getOrDefault(chr,0)+1);
		});
		System.out.println("charsCountOfString using map.getOrDefault method : "+map);
	}
	static void printDistinctCharsWithCount(String str){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		str.chars().mapToObj(c->(char)c).collect(Collectors.toList())
		.forEach(ch->{
			map.merge(ch, 1, Integer::sum);
		});
		
		System.out.println("printDistinctCharsWithCount using map.merge : "+map);
	}
}
