package java8features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class impfuncInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//predicate --- bolean teat(T ob)
		//bipredicate ---- boolean test(T a1 , Ta2)
	   //consumer----> return void contain accpect(T a)
		//bicondsumer retunt void contian acccpet (y a1 y a2)
		//function ---> as similer to predicate but return by deceide by own any and contian one parameter interger , boolean
		//Bifunction ---> visaversa to function
		//suplier ---->  this is retuer value e get()
		//unarayopreator ---> isme type String he toh value bhi string hi hona chiyaya aaply mtd used
		//binaryoprator ---> ek hi vluae se dono parameter kaa type bta dega isme
	//	Predicate<Integer> p = x-> x>50;
	//	System.out.println(p.test(20));//return boolean  value
		
		//BiPredicate<Integer, Integer> p = (x,y)-> x>y;
	//	System.out.println(p.test(30,20));//return boolean  value
		
		//Consumer<String> con = x-> System.out.println(x.length());
	//	con.accept("progrank");
		
	/*	List<Integer> list = Arrays.asList(4,34,6,8,89,4,322);
		Consumer<Integer> c= x-> System.out.println(x);
		list.stream().forEach(c); */
		
	/*	BiConsumer<String , String> con = (a,b)-> System.out.println((a+":"+b));
			con.accept("progrank", "rank"); */
		
	/*	Map<Integer, String> map = new HashMap<>();
		
		map.put(100, "java");
		map.put(200, "python");
		map.put(300, "ruby");
		
		map.forEach(x,y)->System.out.println(x+" : "+y);*/ 
		
	/*	Function<Integer,Boolean> p = x-> x>50;
		
		System.out.print(p.apply(105)); */
		
/*	BiFunction<Integer,Integer,String> p = (x,y)-> x+":"+y;
		
		System.out.print(p.apply(105,56)); */
		
		
	/*	Supplier <String> sup = ()->"yuvraj";
		System.out.print(sup.get());*/
		
/*		UnaryOperator<Integer> u = x->x+2;
	System.out.print(	u.apply(5));	*/	
		
		
		BinaryOperator<Integer> b = (x,y)-> x+y;
		System.out.print(b.apply(12, 14));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
											
	}

}
