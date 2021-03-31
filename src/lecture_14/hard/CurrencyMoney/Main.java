package lecture_14.hard.CurrencyMoney;

import java.util.List;
import java.util.ArrayList;

/**
 * Расширь функциональность программы, которая позволит производить манипуляции
 * с валютами.
 * 
 * 	В абстрактном классе Money создай приватное поле amount типа double. 
 * 	Создай публичный геттер для поля amount(public double getAmount()), чтобы к этому
 * полю можно было получить доступ извне класса Money. 
 * 	В отдельных файлах создай классы Hryvnia, Ruble и USD, которые будут являться потомками класса Money.
 *  В классах Hryvnia, Ruble и USD реализуй метод getCurrencyName() который будет
 * возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD,
 * UAH, RUB).
 *  В классах Hryvnia, Ruble и USD реализуй публичный (public) конструктор, который принимает один параметр и вызывает конструктор базового
 * класса (super) с этим параметром.
 *  Заполни список allMoney объектами всех возможных в рамках условия задачи и функциональности программы валют.
 * 
 * @author ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ivan = new Person("Иван");
		for (Money money : ivan.getAllMoney()) {
			System.out.println(
					ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
		}
	}

	public static class Person {

		String name;
		private List<Money> allMoney;

		Person(String name) {
			this.name = name;
			this.allMoney = new ArrayList<Money>();
			allMoney.add(new Hryvnia(100));
			allMoney.add(new Ruble(50));
			allMoney.add(new USD(25));
		}

		public List<Money> getAllMoney() {
			return allMoney;
		}
	}

}
