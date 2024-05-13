package java8features;

import java.util.Arrays;
import java.util.stream.Collectors;

public class collectelement {

	public static void main(String[] args) {
		
		
		System.out.println(
				
				Arrays.asList("java","javascript","python","go","dart")
				.stream()
				.filter(x-> x.contains("j"))
				.collect(Collectors.toSet())//tolist to map
				
				);
		
		
	}}