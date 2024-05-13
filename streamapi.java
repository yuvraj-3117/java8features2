package java8features;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// terminated mtd
		// IntStream.range(1, 11).forEach(x->System.out.println(x));

		// IntStream num = IntStream.iterate(2, x-> x+1);
		// num.limit(10).forEach(System.out::println);

		// filter is intermidiade mtd
		long c = Stream.of(1, 2, 4, 32, 56, 45, 23).filter(x -> x > 20).count();
		// count is terminal method
		System.out.println(c);
		
		//map in intermidiate
	/*	Stream.of("java","javascript","python","gp","dart").filter(x-> x.contains("j"))
		.map(String::toUpperCase)//predicate return only boolean value chek by isemty
		.forEach(System.out::println);  */
		
		
	Stream.generate(Math::random).limit(5).forEach(System.out::println);

	}

}
