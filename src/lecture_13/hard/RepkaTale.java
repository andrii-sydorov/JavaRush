package lecture_13.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Давай напишем программу по мотивам сказки "Репка":
 * 
 * Реализуй интерфейс RepkaItem в классе Person. В классе Person реализуй метод
 * pull(Person person), который выводит фразу типа '<name> за <person>'.
 * 
 * Пример: Бабка за Дедку 
 * Дедка за Репку
 * 
 * Исправь логическую ошибку цикла в методе tell класса RepkaStory.
 * 
 * Выполни метод main и наслаждайся сказкой!
 * 
 * @author ASY
 *
 */
public class RepkaTale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> plot = new ArrayList<Person>();
		plot.add(new Person("Репка", "Репку"));
		plot.add(new Person("Дедка", "Дедку"));
		plot.add(new Person("Бабка", "Бабку"));
		plot.add(new Person("Внучка", "Внучку"));
		RepkaStory.tell(plot);
	}

	public interface RepkaItem {
		void pull(Person person);
	}

	public static class Person implements RepkaItem {
		String name;
		String person;

		Person(String name, String person) {
			this.name = name;
			this.person = person;
		}

		public void pull(Person person) {
			System.out.println(this.name + "за" + this.person);
		}

	}

	static class RepkaStory {
		public static void tell(List<Person> ls) {
			for (int i = ls.size() - 1; i > 0; i--) {
				System.out.println(ls.get(i).name + " за " + ls.get(i - 1).person);
			}
		}
	}

}
