package lecture_15.hard.SingletonPlanet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * ��� ������� ���� ������ ���� �����:
 * 
 * ����� ������ �������� Singleton � ������� ����������� (lazy initialization).
 * �� ������ � ������� � ��������� ������ ������� � ��������� ������ ��� ������
 * ��������� � Sun, Moon, Earth.
 * ����������� ��������� Planet � ������� Sun, Moon, Earth. 
 * � ����������� ����� ������ Solution ������� ����� readKeyFromConsoleAndInitPlanet(). 
 * ����������� ���������� ������ readKeyFromConsoleAndInitPlanet():
 *  ��� ����� ������ � ������� ���� �������� ���� String.
 *  ���� �� ����� ����� �� �������� ���������� Planet, ������ ��������������� ������ � ������� ��� Planet thePlanet, ����� � ������ Planet thePlanet.
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static Planet thePlanet;

	// add static block here - �������� ����������� ���� ���
	static {
		try {
			readKeyFromConsoleAndInitPlanet();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	public static void readKeyFromConsoleAndInitPlanet() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String planetName = bf.readLine();
		switch (planetName) {
		case Planet.SUN:
			thePlanet = Sun.getInstance();
			break;
		case Planet.MOON:
			thePlanet = Moon.getInstance();
			;
			break;
		case Planet.EARTH:
			thePlanet = Earth.getInstance();
			break;
		default:
			thePlanet = null;
		}

	}

}
