//import typeinfo.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("The Gum class is not found");
		}
		System.out.println("After the metod of Class.forName(\"Gum\")");
	}

}
