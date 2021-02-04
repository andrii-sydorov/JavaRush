package lection9;

/**
 * 1. Есть три исключения последовательно унаследованные от Exception: 
 * 2. class Exception1 extends Exception 
 * 3. class Exception2 extends Exception1 
 * 4. class Exception3 extends Exception2 
 * 5. Есть метод, который описан так: public static void method1() throws Exception1, Exception2, Exception3 
 * 6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
 * 
 * @author ASY
 *
 */
public class CatchThreeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (Exception3 e3) {
		} catch (Exception2 e2) {
		} catch (Exception1 e1) {
		}
	}

	public static void method1() throws Exception1, Exception2, Exception3 {
		int i = (int) (Math.random() * 3);
		if (i == 0) {
			throw new Exception1();
		} else if (i == 1) {
			throw new Exception2();
		} else if (i == 2) {
			throw new Exception3();
		}
	}
}

class Exception1 extends Exception {

}

class Exception2 extends Exception1 {

}

class Exception3 extends Exception2 {

}
