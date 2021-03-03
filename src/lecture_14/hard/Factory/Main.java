package lecture_14.hard.Factory;

/**
 * Давай напишем Фабрику (Factory) по производству кур (Hen):
 * 
 * Создай класс Hen. 
 * 	Сделай его абстрактным. 
 * 	Добавь в класс абстрактный метод int getCountOfEggsPerMonth(). 
 * 	Добавь в класс метод String getDescription(),который возвращает строку "Я - курица.". 
 * Создай класс RussianHen, который наследуется от Hen. 
 * Создай класс UkrainianHen, который наследуется от Hen.
 * Создай класс MoldovanHen, который наследуется от Hen. 
 * Создай класс BelarusianHen, который наследуется от Hen. 
 * В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth. Методы должны
 * возвращать количество яиц в месяц от данного типа куриц. 
 * В каждом из четырех последних классов напиши свою реализацию метода getDescription.
 * 
 * Методы должны возвращать строку вида: <getDescription() родительского класса>
 * + <" Моя страна - Sssss. Я несу N яиц в месяц."> где Sssss - название страны
 * где N - количество яиц в месяц В классе HenFactory реализуй метод getHen,
 * который возвращает соответствующую стране породу кур. Все созданные классы
 * должны быть в отдельных файлах.
 * 
 * @author SMD_ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hen hen = HenFactory.getHen(Country.MOLDOVA);
		System.out.println(hen.getCountOfEggsPerMonth());
		System.out.println(hen.getDescription());
	}

	static class HenFactory {

		static Hen getHen(String country) {
			Hen hen = null;
			if (country.equals("Belarus")) {
				hen = new BelarusianHen();
			} else if (country.equals("Russia")) {
				hen = new RussianHen();
			} else if (country.equals("Ukraine")) {
				hen = new UkrainianHen();
			} else {
				hen = new MoldovanHen();
			}
			return hen;
		}
	}

}
