package java8features;

import java.util.Arrays;
import java.util.List;

public class parrllel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> vlaue = Arrays.asList(1,2,3,4,7);
		
		//vlaue.stream().parallel().forEach(System.out::println);
		
		vlaue.parallelStream().forEach(System.out::println);


	}

}
