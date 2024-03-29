package lecture_15.middle;

/**
 * Программа выводит 0 9, а должна — 6 9. 
 * Найди одну(!) ошибку и исправь ее.
 * Используй дебаг. Для этого поставь breakpoint-ы (Ctrl+F8), потом зайди в меню
 * Run -> Debug. F9 - выполнение кода до следующего breakpoint-а. F8 - переход к
 * следующей строке кода.
 * 
 * @author SMD_ASY
 *
 */
public class Initialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B(6);
	}

	public static class A {
		private int f1 = 7;

		public A(int f1) {
			this.f1 = f1;
			initialize();
		}

		private void initialize() {
			System.out.println(f1);
		}
	}

	public static class B extends A {
		protected int f1 = 3;

		public B(int f1) {
			super(f1);
			this.f1 += f1;
			initialize();
		}

		protected void initialize() {
			System.out.println(f1);
		}
	}

}
