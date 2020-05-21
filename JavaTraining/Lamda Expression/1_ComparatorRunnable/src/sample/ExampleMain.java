package sample;

public class ExampleMain {
	public static void main(String[] argv) {

		Exmaple2 example2 = new Exmaple2();
		
	    Calculator cc= (x,y)-> x + y; 
	    example2.engine(cc);
		 		
//		example2.engine((x, y) -> x + y);
//		example2.engine((x, y) -> x * y);
//		example2.engine((x, y) -> x / y);
//		example2.engine((x, y) -> x % y);
	}

}
