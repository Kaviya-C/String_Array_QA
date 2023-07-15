package practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;

public class java8Stream {
	public static void main(String...args) {
		List<Integer> list=Arrays.asList(11,12,5,6,10);
	
	Stream<Integer> s=list.stream();
	
	Stream<Integer> s1=s.filter(element->(element%5==0));
	
	Integer result=
			list.stream()
			.filter(java8Stream::isDivisible)
			.map(java8Stream::mapDouble)
			.findFirst().orElse(0);
			//.reduce(0,(carry,element)->carry+element);
	        
	System.out.println(result);

	}
public static boolean isDivisible(int i) {
		System.out.println("is divisible method "+i);
		return i%5==0;
	}
	
public static int mapDouble(int i) {
	System.out.println("map double method "+i);
	return i*2;
}

}
