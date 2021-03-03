package lecture_14.middle.WineDegustation;

/**
 * Создать абстрактный класс Drink с реализованным методом public void taste(),
 * который выводит в консоль "Вкусно". 
 * Создать класс Wine, наследуемый от Drink,с реализованным методом public String getHolidayName(), который возвращает
 * строку "День Рождения". 
 * Создать класс BubblyWine, наследуемый от Wine, с реализованным методом public String getHolidayName(), который возвращает
 * строку "Новый Год". 
 * Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine. 
 * Все классы должны находиться в отдельных файлах.
 * 
 * @author SMD_ASY
 *
 */
public class Main {
	public static void main(String[] args) {
		getDeliciousDrink().taste();
		System.out.println(getWine().getHolidayName());
		System.out.println(getBubblyWine().getHolidayName());
		System.out.println(getWine().getHolidayName());
	}

	public static Drink getDeliciousDrink() {
		return new Wine();
	}

	public static Wine getWine() {
		return new Wine();
	}

	public static Wine getBubblyWine() {
		return new BubblyWine();
	}
}
