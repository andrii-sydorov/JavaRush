package lecture_15.middle.FlyingObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * В этой задаче тебе нужно:
 * 
 * Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
 * Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
 * В статическом методе reset() класса Solution: 
 *  считать с консоли параметр типа String; если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter; 
 *  если параметр равен "plane", считать второй параметр типа int (количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
 *  В статическом блоке инициализировать CanFly result, вызвав метод reset(). Закрыть поток ввода методом close().
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
