package lecture_17.easy.SingletonIMF;

public class IMF {

	private static IMF imf;

	private IMF() {

	}

	public static IMF getFund() {
		synchronized (IMF.class) {
			if (imf == null) {
				imf = new IMF();
			}
		}
		return imf;
	}

}
