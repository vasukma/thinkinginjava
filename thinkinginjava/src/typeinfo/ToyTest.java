package typeinfo;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
//interface

class Toy {
	//Toy() {}
	Toy(int i) {}
}

class FancyToy extends Toy 
	implements HasBatteries, Waterproof, Shoots {
	
	FancyToy() { super(1); }
}

public class ToyTest {

	static void printInfo(Class cc) {
		System.out.println("A name of class: " + cc.getName() +
				" Is it an interface? [" + cc.isInterface() + "]");
		System.out.println("A simple name: " + cc.getSimpleName());
		System.out.println("A canonical name: " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("typeinfo.FancyToy");
		} catch(ClassNotFoundException e) {
			System.out.println("Not found FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face: c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch(InstantiationException e) {
			System.out.println("Doesn't creat an instant");
			System.exit(1);
		} catch(IllegalAccessException e) {
			System.out.println("Access denied!");
			System.exit(1);
		}
		printInfo(obj.getClass());
		
	}

}
