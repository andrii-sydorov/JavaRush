package lecture_14.hard.TaskPerson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	/**
	 * Давай напишем программу, которая определит, чем заняться тому или иному
	 * человеку. Для этого нужно:
	 * 
	 * Ввести [в цикле] с клавиатуры несколько строк (ключей). 
	 * Строки (ключи) могут быть такими: "user", "loser", "coder", "proger". 
	 * Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
	 * 
	 * Для каждой введенной строки нужно: 
	 * 	Создать соответствующий объект [см.Person.java], например, для строки "user" нужно создать объект класса User.
	 * 	Передать этот объект в метод doWork. 
	 * 
	 * Написать реализацию метода doWork, который: 
	 * 	Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User. 
	 * 	Вызывает метод doNothing(), если person имеет тип Loser. 
	 * 	Вызывает метод writeCode(), если person имеет тип Coder. 
	 * 	Вызывает метод enjoy(), если person имеет тип Proger.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Enter your style of life:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Person person = null;
		metka: while (true) {
			String key = bf.readLine();
			switch (key) {
			case "user":
				person = new Person.User();
				break;
			case "loser":
				person = new Person.Loser();
				break;
			case "coder":
				person = new Person.Coder();
				break;
			case "proger":
				person = new Person.Proger();
				break;
			default:
				break metka;
			}
			doWork(person);
		}

	}

	public static void doWork(Person person) {
		if (person instanceof Person.User) {
			Person.User user = (Person.User) person;
			user.live();
		} else if (person instanceof Person.Loser) {
			Person.Loser loser = (Person.Loser) person;
			loser.doNothing();
		} else if (person instanceof Person.Coder) {
			Person.Coder coder = (Person.Coder) person;
			coder.writeCode();
		} else if (person instanceof Person.Proger) {
			Person.Proger proger = (Person.Proger) person;
			proger.enjoy();
		}
	}

}
