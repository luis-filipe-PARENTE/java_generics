package video_one;

import java.util.ArrayList;

public class Main {
	
	public static void main(String ...args) {
		
		ArrayList<Integer> items = new ArrayList<>();
		
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
		
		Main.printdoubled(items);
	}
	
	private static void printdoubled(ArrayList<Integer> n) {
		n.stream().forEach(i -> System.out.println(i * 2));
	}
	
	
	
	

}
