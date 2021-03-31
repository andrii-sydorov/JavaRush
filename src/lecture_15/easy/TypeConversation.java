package lecture_15.easy;

/**
 * Удали реализации всех лишних методов, чтобы вывод программы выглядел так: Это
 * double Это Object Это double Это Integer Это double
 * 
 * @author SMD_ASY
 *
 */
public class TypeConversation {

	public static void main(String[] args) {
		print((short) 1);
		print((Number) 1);
		print(1);
		print((Integer) 1);
		print(1);
	}

	public static void print(Integer i) {
		System.out.println("Это Integer");
	}

	public static void print(Object i) {
		System.out.println("Это Object");
	}

	public static void print(double i) {
		System.out.println("Это double");
	}

	// my changes
	// при перегрзуке методов сначало происходит расширение по примитивам, а потом
	// уже по классам обёрткам, именно по этому результат print((short) 1);
	// будет "Это double", если же закомментировать реализацию через double, то в
	// консоли появится "Это Short"
	/*
	 * Сначала примитив расширяется: byte->short->int->long->float->double. Если не
	 * найдёт подходящий метод, то потом упаковывается в свой объект (int->Integer ,
	 * short -> Short и.т.д) и ищет именно его. Если не находит, сужается (уже
	 * будучи объектом) до Number, и затем до Object.
	 * 
	 * по-моему так.
	 */
	public static void print(Short i) {
		System.out.println("Это Short");
	}

}
