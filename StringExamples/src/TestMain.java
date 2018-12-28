import java.util.Arrays;
import java.util.stream.IntStream;

public class TestMain {

	/*
	 * Please write a function that takes a integer array and then returns an integer array. 
	 * the returned array should be the same as the one passed in, but reversed. 
	 * Then write another method which calls this and tests the array is reversed.
	 */
	public static void main(String[] args) {
		

		long startTime,endTime;
		
		Integer[] intArr = {23,435,567,77};
		startTime = System.nanoTime();
		System.out.println("REVERSE AN INTEGER ARRAY : "+reverseIntArray(intArr));
		endTime = System.nanoTime();
		System.out.println("TIME TAKEN IS : "+(endTime-startTime));
		
		Integer[] intArr2 = {23,435,567,77};
		startTime = System.nanoTime();
		System.out.println("REVERSE AN INTEGER ARRAY 2: "+reverseIntArray2(intArr2));
		endTime = System.nanoTime();
		System.out.println("TIME TAKEN IS : "+(endTime-startTime));

		Integer[] intArray = {23,435,567,77};
		startTime = System.nanoTime();
		System.out.println("REVERSE AN INTEGER ARRAY : "+reverseAnArray(intArray));
		endTime = System.nanoTime();
		System.out.println("TIME TAKEN WITH JAVA8 IS : "+(endTime-startTime));
//		String[] numbers = {"one","two","three","four"};
//		System.out.println("REVERSE STRING ARRAY : "+Arrays.asList(revesreAnArray.reverseAnArray(numbers)));
//		
//		Character charArray[] = { 'a', 'b', 'c', 'd', 'e' };
//		System.out.println("REVERSE CHAR ARRAY : "+Arrays.asList(revesreAnArray.reverseAnArray(charArray)));
		
	}

	static Object[] reverseAnArray(Object[] array) {
		    return IntStream.rangeClosed(1, array.length)
		      .mapToObj(i -> array[array.length - i])
		      .toArray();
		}
	
	static Integer[] reverseIntArray(Integer[] array){
		Integer start = 0;
		Integer end = array.length-1;
		
		while(start<end){
			Integer temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}
	
	static Integer[] reverseIntArray2(Integer[] array){
		Integer start = 0;
		Integer end = array.length-1;
		
		while(start<end){
			array[start] = array[start] + array[end];
			array[end] = array[start] - array[end];
			array[start] = array[start] - array[end];
			start++;
			end--;
		}
		return array;
	}
}
