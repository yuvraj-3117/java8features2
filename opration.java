package java8features;

public interface opration //functinal interface
{
	public  int opt(int x, int y); 
		

}

class main{
	
//	public static void result(int x, int y , opration obj) {
		
	//	System.out.print(obj.opt(x, y));
		
//	}
	public static void main(String [] args ) {
		
		//result(5,8,(a,b)->(a+b));
		
		opration obj = (a,b)->(a+b);
		System.out.print(obj.opt(12,8));
		
		
		
		
	}
}
