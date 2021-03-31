package lecture_15.middle;

/**
 * В этой задаче тебе нужно:
 * 
 * Создать 7 public полей класса:
 *  intVar типа int doubleVar типа
 *  double DoubleVar типа Double 
 *  booleanVar типа boolean 
 *  ObjectVar типа Object
 *  ExceptionVar типа Exception
 *  StringVar типа String
 * Убедиться, что они инициализируются дефолтными значениями. Вывести их значения в заданном
 * порядке в методе main()
 * 
 * @author SMD_ASY
 *
 */

public class ClassFiled {
	// обьявление переменных класса
	// переменные классы всегда инициализируются значениями по умолчанию, не важно статические они или нет.
	int intVar;
	double doubleVar;
	Double DoubleVar;
	boolean booleanVar;
	Object ObjectVar;
	Exception ExceptionVar;
	String StringVar;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassFiled cs = new ClassFiled();
		System.out.println(cs.intVar);
		System.out.println(cs.doubleVar);
		System.out.println(cs.DoubleVar);
		System.out.println(cs.booleanVar);
		System.out.println(cs.ObjectVar);
		System.out.println(cs.ExceptionVar);
		System.out.println(cs.StringVar);
	}

}
