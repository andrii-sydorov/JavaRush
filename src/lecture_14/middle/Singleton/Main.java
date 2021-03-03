package lecture_14.middle.Singleton;

/**
 * Реализуй Singleton pattern:
 * 
 * 	Создай класс Singleton в отдельном файле. 
 * 	Добавь в него статический метод getInstance(). 
 * 	При любом вызове метода getInstance() он должен возвращать один и тот же объект класса Singleton.
 *  Подумай, каким образом можно запретить создание других объектов этого класса.
 *  Сделай все конструкторы в классе Singleton приватными (private).
 *  В итоге должна быть возможность создать объект (экземпляр класса) используя только метод getInstance
 * 
 * @author ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object s = Singleton.getInstance();
		System.out.println(s);
	}

}
