package lecture_16.hard;

import java.util.List;
import java.util.ArrayList;

/**
 * ��� �������� ������ � ����. ������ �����(Gamer) ��������������� �����
 * �����������: ��������(name) � ����������� �������� � ������� (rating). 
 * ����� ������� � ������� ��� ���� � ���������� ���������� � �����������. ����... 
 * 1.���������, ��� ������ ���������.
 *  1.1. List<String> steps ������ ������������������ ��������, ������� ������ ����� ��������� �� 0 ��
 * ����������. 
 *  1.2. isWinnerFound ����������, ������ ���������� ��� ���. 
 *  1.3. ����� sleep ����������� InterruptedException � ��������� �������� ���� long.
 *  1.4. ������ ������ ���������� ���� �� �����. 
 * 2. �������� ������ ������ run ���, ����� ��� ������� ������:
 *  2.1. ����� ������ ��������� ������� (1000ms / rating) ���������� � ������� ��������, ��������� � steps.
 *  2.2. ����� ����� ������ ���������� � ������� ������ (����� getName()), ����� ���������
 * ���������, � ����� ��� �����.
 * 
 * ������: Ivanov:������ ����
 * 
 *  2.3. ����� ����� �������� ��� �������� �� steps, �� �� ��������� �����������.
 * ������ getName() + ":����������!" 
 *  2.4. ����� ������ ����������, �� ���� ���������������, � ��������� ������ ��������� ������������. ������ ��� ���
 * getName() + ":��������"
 * 
 * @author SMD_ASY
 *
 */

public class Gamers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineGame onlineGame = new OnlineGame();
		onlineGame.start();
	}

	public static class OnlineGame extends Thread {

		public static volatile boolean isWinnerFound = false;

		public static List<String> steps = new ArrayList<String>();

		static {
			steps.add("������ ����");
			steps.add("���� ��������");
			steps.add("���� ���������");
			steps.add("�������� ������");
		}

		protected Gamer gamer1 = new Gamer("Ivanov", 3);
		protected Gamer gamer2 = new Gamer("Petrov", 1);
		protected Gamer gamer3 = new Gamer("Sydorov", 5);

		public void run() {
			gamer1.start();
			gamer2.start();
			gamer3.start();
			while (!isWinnerFound) {
			}
			gamer1.interrupt();
			gamer2.interrupt();
			gamer3.interrupt();
		}

	}

	public static class Gamer extends Thread {
		private int rating;

		public Gamer(String name, int rating) {
			super(name);
			this.rating = rating;
		}

		public void run() {
			try {
				for (int i = 0; i < OnlineGame.steps.size(); i++) {
					System.out.println(getName() + ":" + OnlineGame.steps.get(i));
					Thread.sleep(1000 / rating);
				}
				if (!OnlineGame.isWinnerFound) {
					OnlineGame.isWinnerFound = true;
					System.out.println(getName() + ":" + "����������!");
				}
			} catch (InterruptedException ie) {
				System.out.println(getName() + ":" + "��������");
			}
		}
	}

}
