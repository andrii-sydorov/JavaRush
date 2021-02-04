package lection9;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * ≈сть метод, который выбрасывает два исключени€, унаследованные от Exception,
 * и два унаследованных от RuntimeException: NullPointerException,
 * ArithmeticException, FileNotFoundException, URISyntaxException.
 * 
 * Ќужно перехватить NullPointerException и FileNotFoundException, но не
 * перехватывать ArithmeticException и URISyntaxException.  ак это сделать?
 * 
 * @author ASY
 *
 */
public class WorkingWithTwoExceptions {
	public static void main(String[] args) throws ArithmeticException, URISyntaxException {
		try {
			method1();
		} catch (NullPointerException npe) {

		} catch (FileNotFoundException fnfe) {

		}
	}

	public static void method1()
			throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
		int i = (int) (Math.random() * 4);
		if (i == 0) {
			throw new NullPointerException();
		} else if (i == 1) {
			throw new ArithmeticException();
		} else if (i == 2) {
			throw new FileNotFoundException();
		} else if (i == 3) {
			throw new URISyntaxException("", "");
		}
	}
}
