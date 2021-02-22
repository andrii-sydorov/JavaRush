package lecture_14.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ��������, ��� ������ ��� ���������. ����� ������ haveFun ���, ����� ��
 * ������� �����:
 * 
 * play(), ���� person ����� ��� Player. 
 * dance(), ���� person ����� ��� Dancer
 * 
 * @author SMD_ASY
 *
 */

public class DowncastingInterface {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Person person = null;
		String name;
		while (!(name = bf.readLine()).equals("exit")) {
			if (name.equals("dancer")) {
				person = new Dancer();
			} else if (name.equals("player")) {
				person = new Player();
			}
			haveFun(person);
		}

	}

	public static void haveFun(Person person) {
		if (person instanceof Player) {
			Player player = (Player) person;
			player.play();
		} else if (person instanceof Dancer) {
			Dancer dancer = (Dancer) person;
			dancer.dance();
		}
	}

	interface Person {

	}

	static class Player implements Person {
		void play() {
			System.out.println("playing");
		}
	}

	static class Dancer implements Person {
		void dance() {
			System.out.println("dancing");
		}
	}
}
