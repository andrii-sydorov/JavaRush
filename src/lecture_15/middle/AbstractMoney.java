package lecture_15.middle;

/**
 * Исправь класс Hryvnia так, чтоб избежать возникновения ошибки
 * StackOverflowError.
 * 
 * @author SMD_ASY
 *
 */

public class AbstractMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Hryvnia().getAmount());
	}

	public static abstract class Money {
		abstract Money getMoney();

		public Object getAmount() {
			return getMoney().getAmount();
		}
	}

	public static class Hryvnia extends Money {
		private double amount = 123d;

		public Hryvnia getMoney() {
			return this;
		}

		public Object getAmount() {
			Object obj = Double.valueOf(amount);
			return obj;
		}
	}

}
