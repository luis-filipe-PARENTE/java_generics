package generics.test.out.of.cours;

public class Test1 {
	
	
	public static void main(String ...args) {
		Double monDouble = new Double(4.0);
		System.out.println(monDouble.intValue());
		
		Test1.square();
	}
	
	
	private static void square() {
		Obj<Integer> obj1  = new Obj<>(3);
		Obj<Double> obj2  = new Obj<>(3.0);
		
		obj1.square(obj2);
		
		
		System.out.println(obj1.square(obj2));
	}

}
