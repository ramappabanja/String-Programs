import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {

		isAnagram1("Mother In Law", "Hitler Woman");
		isAnagram1("keEp", "peeK");
		isAnagram1("SiLeNt CAT", "LisTen AcT");
		isAnagram1("Debit Card", "Bad Credit");
		isAnagram1("School MASTER", "The ClassROOM");
		isAnagram1("DORMITORY", "Dirty Room");
		isAnagram1("ASTRONOMERS", "NO MORE STARS");
		isAnagram1("Toss", "Shot");
		isAnagram1("joy", "enjoy");
	}

	static void isAnagram1(String s1, String s2){
		String cos1 = s1.replaceAll("\\s", "").toLowerCase();
		String cos2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		if(cos1.length()!=cos2.length())
			status = false;
		else{
			char[] arrayOfs1 = cos1.toCharArray();
			for(char ch : arrayOfs1){
				int index = cos2.indexOf(ch);
				if(index!=-1){
					cos2=cos2.substring(0, index)+cos2.substring(index+1);
				}else{
					status = false;
					break;
				}
			}
		}
		
		if (status)
			System.out.println(s1 + " and " + s2 + " are anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are not anagrams");
	}
	
	static void isAnagram2(String s1, String s2){
		String cos1 = s1.replaceAll("\\s", "").toLowerCase();
		String cos2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		
		if(cos1.length()!=cos2.length())
		status = false;
		else{
			char[] charrArray = cos1.toCharArray();
			StringBuilder sb= new StringBuilder(cos2);
			
			for(char ch : charrArray){
				int index = sb.indexOf(""+ch);
				if(index!=-1)
					sb.deleteCharAt(index);
				else{
					status = false;
					break;
				}
			}
		}
		
		if (status)
			System.out.println(s1 + " and " + s2 + " are anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are not anagrams");
	}
	
	static void isAnagram3(String s1, String s2) {
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if (copyOfs1.length() != copyOfs2.length())
			status = false;
		else {
			char[] charArray1 = copyOfs1.toLowerCase().toCharArray();
			char[] charArray2 = copyOfs2.toLowerCase().toCharArray();
			Arrays.parallelSort(charArray1);
			Arrays.parallelSort(charArray2);

			status = Arrays.equals(charArray1, charArray2);
		}

		if (status)
			System.out.println(s1 + " and " + s2 + " are anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are not anagrams");
	}
}
