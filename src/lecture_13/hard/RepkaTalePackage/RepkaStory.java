package lecture_13.hard.RepkaTalePackage;

import java.util.List;

public class RepkaStory {
	public static void tell(List<Person> ls) {
		for (int i = ls.size() - 1; i > 0; i--) {
			ls.get(i).pull(ls.get(i - 1));
		}
	}
}
