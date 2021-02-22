package lecture_13.hard.RepkaTalePackage;

import java.util.List;
import java.util.ArrayList;

/**
 * Давай напишем программу по мотивам сказки "Репка":
 * 
 * Реализуй интерфейс RepkaItem в классе Person. 
 * В классе Person реализуй метод pull(Person person), который выводит фразу типа '<name> за <person>'.
 * 
 * Пример: 
 * Бабка за Дедку 
 * Дедка за Репку 
 * 
 * Исправь логическую ошибку цикла в методе tell класса RepkaStory. 
 * 
 * Выполни метод main и наслаждайся сказкой!
 * 
 * @author ASY
 *
 */
public class Tale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> plot = new ArrayList<Person>();
		plot.add(new Person("Репка", "Репку"));
		plot.add(new Person("Дедка", "Дедку"));
		plot.add(new Person("Бабка", "Бабку"));
		plot.add(new Person("Внучка", "Внучку"));
		RepkaStory.tell(plot);
	}

}
