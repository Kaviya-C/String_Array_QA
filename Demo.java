package practise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo {
	public static void main(String...args) {
		
		List<Integer> list=Arrays.asList(1,2,11,1,1);
	    
		Integer.sum(12,12);	
		
		Integer result=list.stream()
		          .map(new Function<Integer,Integer>()
		          {
		  			public Integer apply(Integer i) 
		  			{
						return i*2;
					}
				})
		  		.reduce(0,(Integer::sum));

		System.out.println(result);
	
	}
}
	//result.forEach(System.out::println);
