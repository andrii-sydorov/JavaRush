package lecture_15.middle.FlyingObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * � ���� ������ ���� �����:
 * 
 * ������� � ��������� ������ ������ Plane � Helicopter, ����������� ��������� CanFly.
 * ����� Plane ������ ����� ����������� � ���������� int - ���������� ����������� ����������.
 * � ����������� ������ reset() ������ Solution: 
 *  ������� � ������� �������� ���� String; ���� �������� ����� "helicopter", ������������ ������� CanFly result ��������� ������ ������ Helicopter; 
 *  ���� �������� ����� "plane", ������� ������ �������� ���� int (���������� ����������), ������������ ������� CanFly result ��������� ������ ������ Plane.
 *  � ����������� ����� ���������������� CanFly result, ������ ����� reset(). ������� ����� ����� ������� close().
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (result != null) {
			result.fly();
		} else {
			System.out.println("The object wasn't created");
		}
	}

	static {
		try {
			reset();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static CanFly result;

	public static void reset() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String key = bf.readLine();
		switch (key) {
		case "helicopter":
			result = new Helicopter();
			break;
		case "plane":
			int value = Integer.valueOf(bf.readLine());
			result = new Plane(value);
			break;
		default:
			break;
		}
	}

}
