package lecture_14.easy;

/**
 * Напиши реализацию метода printMainInfo, чтобы:
 * 
 * Если в метод передают объект типа Drawable, у этого объекта вызывался метод
 * draw. 
 * Если в метод передают объект типа Movable, у этого объекта вызывался
 * метод move.
 * 
 * @author SMD_ASY
 *
 */
public class GeometricFigure {
	public static void main(String[] args) {
		Object obj = new Circle();
		Movable movable = (Movable) obj;
		Drawable drawable = new Rectangle();

		println(movable);
		println(drawable);
	}

	public static void println(Object obj) {
		if (obj instanceof Movable) {
			((Movable) obj).move();
		} else if (obj instanceof Drawable) {
			((Drawable) obj).draw();
		}
	}

	 static interface Movable {
		void move();
	}

	static interface Drawable {
		//To do check the difference between static interface and nostatic interface
		void draw();
	}

	static class Circle implements Movable {
		public void move() {
			System.out.println("Circle can be moved");
		}

		public void draw() {
			System.out.println("Circle can be drawn");
		}
	}

	static class Rectangle implements Drawable {
		public void move() {
			System.out.println("Rectangle can be moved");
		}

		public void draw() {
			System.out.println("Rectangle can be drawn");
		}
	}
}
