package java8features;

public interface start {
	
	
		public void show(int x,int y);
	}

	 class LambdaEXpression {

		public static void main(String[] args) {
			
			start s1=(x,y)->{
				System.out.println(x*y);
			};
			s1.show(19, 7);
		
		}

	}



