package lecture_15.hard.SingletonPlanet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * для решения этой задачи тебе нужно:
 * 
 * Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
 * По образу и подобию в отдельных файлах создать в отдельных файлах три класса
 * синглтона — Sun, Moon, Earth.
 * Реализовать интерфейс Planet в классах Sun, Moon, Earth. 
 * В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet(). 
 * Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
 *  для этого считай с консоли один параметр типа String.
 *  если он равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static Planet thePlanet;

	// add static block here - добавьте статический блок тут
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
