package lecture_16.hard;

/**
 * 1. ������ ����� GenerateThread ���, ����� �� ���� �����. 
 * 2. ������ ����������� GenerateThread, ������� ������:
 *  2.1. ������� ����������� ����������� � ���������� String - ������� ��������� ����. ���������
 * createdThreadCount.
 *  2.2. ��������� ������� ����.
 *  2.3. ����� ������ ���� ������ ���������� � 1. 
 * 3. ������������ ����� toString, ��� ����� ������ GenerateThread ����� Alt+Insert -> Override Methods. ����� �������� toString.
 * 	3.1. ����� toString ������ ���������� � ������� ���� � ����� " created". ��������� getName().
 * 
 * ������: 8 created
 * 
 * 4. ���� ���������� ��������� ����� ������ Solution.count ����� run ������:
 * 	4.1. ������� ����� ���� ���� GenerateThread. 4.2. ������� � ������� ���������
 * � ������ 4.1 ����. 
 * 5. � ����� ������ ���� �������� � ������� 15 �����.
 * 
 * @author SMD_ASY
 *
 */

public class ThreadRecursion {

	static int count = 15;
	static volatile int createdThreadCount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new GenerateThread());
	}

	public static class GenerateThread extends Thread {

		public GenerateThread() {
			super(String.valueOf(++createdThreadCount));
			start();
		}

		@Override
		public void run() {
			if (createdThreadCount < count) {
				System.out.println(new GenerateThread());
			}
		}

		@Override
		public String toString() {
			return getName() + " created";
		}
	}

}
