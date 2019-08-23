package typeinfo.pets;

import java.util.*;

public abstract class PetCreator {
	private Random rand = new Random(47);
	public abstract List<Class<? extends Pet>> type();
}
