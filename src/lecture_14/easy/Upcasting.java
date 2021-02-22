package lecture_14.easy;

/**
 * Давай напишем программу, которая создает мышонка. Для этого инициализируй
 * объект obj таким классом, чтобы метод main() выполнился без ошибок.
 * 
 * Происходит downcasting.
 * 
 * @author SMD_ASY
 *
 */
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Jerry();
		Mouse mouse = (Mouse) obj;
		GrayMouse grayMouse = (GrayMouse) mouse;
		Jerry jerry = (Jerry) grayMouse;

		System.out.println(obj.getClass().getSimpleName());
		System.out.println(mouse.getClass().getSimpleName());
		System.out.println(grayMouse.getClass().getSimpleName());
		System.out.println(jerry.getClass().getSimpleName());
		System.out.println();
		Object[] objArray = new Object[] { obj, mouse, grayMouse, jerry };
		for (Object a : objArray) {
			System.out.println(a.getClass().getSimpleName());
		}
	}

	static class Mouse {

	}

	static class GrayMouse extends Mouse {

	}

	static class Jerry extends GrayMouse {

	}

}
