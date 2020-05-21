package impl1;

	//@FunctionalInterface
	interface Calculator{
	  int calculate(int x, int y);
	}
public class Exmaple2 {
	 private static void engine(Calculator calculator){
		    int x = 4, y = 2;
		    int result = calculator.calculate(x,y);
		    System.out.println(result);
		  }
	 
	 
	public static void main(String[] argv) {
		Exmaple2 e = new Exmaple2();
		Calculator cc= (x,y)-> x + y;
	    e.engine(cc);
	    e.engine((x,y)-> x + y);
	    e.engine((x,y)-> x * y);
	    e.engine((x,y)-> x / y);
	    e.engine((x,y)-> x % y);
	  }
	 
	}

 
