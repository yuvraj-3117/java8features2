package java8features;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatmap {
//flatmap bhot saari list ko single list me convert krta he
	public static void main(String[] args) {
		
	/*	List<String> lst1 = Arrays.asList("A","B");
		List<String> lst2 = Arrays.asList("C","D","E");
		List<String> lst3 = Arrays.asList("F","G");
		
		System.out.println(
				
				Stream.of(lst1,lst2,lst3).flatMap(List::stream).collect(Collectors.toList())
				
				);*/
		
		Map<String ,List<Integer>> map = new LinkedHashMap<>();
		map.put("one", Arrays.asList(1,2,3));
		map.put("two", Arrays.asList(4,5,6));
		
		System.out.println(
		map.values().stream().flatMap(List::stream).collect(Collectors.toList()));
		
		

	}

}
