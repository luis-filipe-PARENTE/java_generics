package generics.test.out.of.cours;

public class Obj<T extends Number> {
	
	T obj;

	public Obj(T obj) {
		this.obj = obj;
	}
	
	public double square(Obj<?> item) {
		return this.obj.intValue() * item.obj.intValue();	
	}
	
	void showType() {
		System.out.println(this.getClass().getName());
	}
}
