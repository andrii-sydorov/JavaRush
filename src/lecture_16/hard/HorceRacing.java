package lecture_16.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * ���������, ��� ������ ���������. 
 * �������� ����� calculateHorsesFinished. �� ������: 
 * 1. ��������� ���������� �������������� ������� � ���������� ���. ��������� ����� isFinished(). 
 * 2. ���� ������ ��� �� ������ � ������ (!isFinished()), ��: 
 * 2.1. ������� � ������� "Waiting for " + horse.getName().
 * 2.2. ���������, ���� ��� �������� �����. �������, ����� ����� ����� ������������ ��� �����. 
 * 2.3. �� ������� ����� ������ ��������������.
 * 
 * @author SMD_ASY
 *
 */

public class HorceRacing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<Horse> horses = prepareHorsesAndStart(10);
		while (calculateHorsesFinished(horses) != horses.size()) {
		}
	}

	public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
		int finishedCount = 0;
		for (int i = 0; i < horses.size(); i++) {
			if (horses.get(i).isFinished()) {
				finishedCount++;
			} else {
				System.out.println("Waiting for" + horses.get(i).getName());
				horses.get(i).join();
			}
		}
		return finishedCount;
	}

	public static List<Horse> prepareHorsesAndStart(int horseCount) {
		List<Horse> horses = new ArrayList<>(horseCount);
		String number;
		for (int i = 1; i < horseCount + 1; i++) {
			number = i < 10 ? ("0" + i) : "" + i;
			horses.add(new Horse("Horse_" + number));
		}

		for (int i = 0; i < horseCount; i++) {
			horses.get(i).start();
		}
		return horses;
	}

	public static class Horse extends Thread {

		private boolean isFinished;

		public Horse(String name) {
			super(name);
		}

		public boolean isFinished() {
			return isFinished;
		}

		public void run() {
			String s = "";
			for (int i = 0; i < 1001; i++) { // Delay
				s += "" + i;
				if (i == 1000) {
					s = " has finished the race!";
					System.out.println(getName() + s);
					isFinished = true;
				}
			}
		}
	}

}
