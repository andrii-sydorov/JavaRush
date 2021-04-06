package lecture_17.easy;

import java.util.List;
import java.util.ArrayList;

/**
 * Класс Note будет использоваться нитями. Поэтому сделай так, чтобы вcе методы
 * были синхронизированы
 * 
 * @author ASY
 *
 */

public class SynchronizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class Note {
		public final List<String> notes = new ArrayList<>();

		public synchronized void addNotes(String note, int index) {
			System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
			notes.add(index, note);
			System.out.println("Уже добавлена заметка [" + note + "]");
		}

		public synchronized void removeNotes(int index) {
			System.out.println("Сейчас будет удалена заметка с позиции " + index);
			String note = notes.remove(index);
			System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
		}

	}

}
