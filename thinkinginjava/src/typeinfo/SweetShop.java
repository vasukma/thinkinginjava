package typeinfo;

class Candy {
	static {
		System.out.println("The Candy class is loading");
	}
}

class Gum {
	static {
		System.out.println("The Gum class is loading");
	}
}

class Cookie {
	static {
		System.out.println("The Cookie class is loading");
	}
}

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("In the method main");
		new Candy();
		System.out.println("The Candy is After the creation");
		try {
			Class.forName("typeinfo.Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("The Gum class is not found");
		}
		System.out.println("After the metod of Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After the creation Cookie");
		System.out.println(new Cookie().getClass());

	}
///
}
