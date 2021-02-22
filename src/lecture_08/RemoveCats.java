package lecture_08;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveCats {

	public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> it = cats.iterator();
        while(it.hasNext()) {
        	it.next();
        	it.remove();
        	break;
        }
        printCats(cats);
	}

	public static Set<Cat> createCats() {
		// напишите тут ваш код. step 2 - пункт 2
		Set<Cat> cats = new HashSet<>();
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		return cats;
	}

	public static void printCats(Set<Cat> cats) {
		// step 4 - пункт 4
		for (Cat cat : cats) {
			System.out.println(cat);
		}
	}

	// step 1 - пункт 1
	public static class Cat {

	}
}
