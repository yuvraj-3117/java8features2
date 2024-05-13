package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//sequantce of element provide some computational opreation colections like aeray list link list provide opration them is konw as stream
//it is part of functinal interface


//predicate is a predefine functional intferace  return boolrean value
public class streamPredicate {

	public static void main(String[] args) {
			List<car> carlist = Arrays.asList(
					
					new car("toyta", "white",300000),
					new car("bmw", "black",750000),
					new car("mercidibenz", "yellow",600000),
					new car("toyta", "white",500000)
					
					
					); 
			System.out.print(carlist);
			
			
		//	Predicate<car> p = x->x.getPrice()>500000;
	/*		Predicate<car> p = x->x.getName().contains("m");
			
			for(car c :carlist) {
				
				if(p.test(c))
					
					System.out.println(c.getName());
			}*/
			
			
	List<car> carlist2 =		carlist.stream().filter(x->x.getPrice()<600000)
			.collect(Collectors.toList());
	
	System.out.println(carlist2);
			
			
			
		

	}

}
