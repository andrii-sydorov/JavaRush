package lecture_17.easy.SingletonIMF;

/**
 * Singleton паттерн - синхронизация в методе. Класс IMF - это Международный
 * Валютный Фонд. Внутри метода getFund создай синхронизированный блок. Внутри
 * синхронизированного блока инициализируй поле imf так, чтобы метод getFund
 * всегда возвращал один и тот же объект.
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMF fund = IMF.getFund();
		IMF anotherFund = IMF.getFund();
		System.out.println(fund == anotherFund);
	}

}
