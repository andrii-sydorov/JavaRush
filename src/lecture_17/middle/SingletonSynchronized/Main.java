package lecture_17.middle.SingletonSynchronized;

/**
 * И снова Singleton паттерн - синхронизация в статическом блоке. Внутри класса
 * OurPresident в статическом блоке создай синхронизированный блок. Внутри
 * синхронизированного блока инициализируй president.
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurPresident expectedPresident = OurPresident.getOurPresident();
		OurPresident president = OurPresident.getOurPresident();
		System.out.println(expectedPresident == president);
	}
}
