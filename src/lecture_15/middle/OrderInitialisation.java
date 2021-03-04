package lecture_15.middle;

/**
 * Разберись, что и в какой последовательности инициализируется в этой
 * программе, а затем:
 * 
 * Поставь брейкпойнты и используй дебаггер.
 * Исправь порядок инициализации данных так, чтобы результат был следующим: 
 * static void init() 
 * Static block
 * public static void main 
 * Non-static block 
 * static void printAllFields 
 * 0 
 * null
 * Solution constructor
 * static void printAllFields 
 * 6 
 * First name
 * 
 * @author SMD_ASY
 *
 */
public class OrderInitialisation {

	static {
		init();
	}

	static {
		System.out.println("Static block");
	}

	{
		System.out.println("Non-static block");
		printAllFields(this);
	}

	public int i = 6;

	public String name = "First name";

	public OrderInitialisation() {
		System.out.println("Solution constructor");
		printAllFields(this);
	}

	public static void init() {
		System.out.println("static void init()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("public static void main");
		OrderInitialisation s = new OrderInitialisation();
	}

	public static void printAllFields(OrderInitialisation obj) {
		System.out.println("static void printAllFields");
		System.out.println(obj.i);
		System.out.println(obj.name);

	}

}
