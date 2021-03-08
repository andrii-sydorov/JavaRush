package lecture_16.middle;

/**
 * 1. ���������, ��� ������ ���������. 
 * 2. �������� ������ ������� join() ���, ����� ��� ������ ����� ����������� ���������:
 *  2.1. ������� ����� ������ �����.
 *  2.2. ����� ��� ������ ������� �� �������� � ������������ �������.
 *  2.3. � ����� ����� �������� �� ����� � ��������. 
 *  2.4. ��� ������� ��� ����� ����� ����� ���� ���������� � ��������� ��� ������ �����. 
 *  2.5. �������� ��� ����� (200 ��) � investigateWorld.
 * 
 * @author SMD_ASY
 *
 */

public class Kittens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("�����");
		Cat cat2 = new Cat("�������");
	}

	private static void investigateWorld() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException ie) {
		}
	}

	public static class Cat extends Thread {
		protected Kitten kitten1;
		protected Kitten kitten2;

		public Cat(String name) {
			super(name);
			kitten1 = new Kitten("������� 1, ���� - " + getName());
			kitten2 = new Kitten("������� 2, ���� - " + getName());
			start();
		}

		public void run() {
			System.out.println(getName() + " ������ 2 �������");
			try {
				initAllKittens();
				kitten1.join();
				kitten2.join();
			} catch (InterruptedException e) {
			}
			System.out.println(getName() + ": ��� ������ � ��������. " + getName() + " ������� �� �����");
		}

		private void initAllKittens() throws InterruptedException {
			kitten1.start();
			kitten2.start();
		}
	}

	public static class Kitten extends Thread {
		public Kitten(String name) {
			super(name);
		}

		public void run() {
			System.out.println(getName() + ", ����� �� ��������");
			investigateWorld();
		}
	}

}
