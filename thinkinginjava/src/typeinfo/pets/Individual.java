package typeinfo.pets;


abstract public class Individual {
	static int count = 0;
	final int id = count++;
	String name;
	
	Individual() { name = ""; }
	Individual(String name) { this.name = name; }

//	public static void main(String[] argc) {
//		for(int i = 0; i < 10; i++)
//			System.out.println("ID: " + Integer.toString(new Test().id));
//	}
}

//class Test extends Individual {}
