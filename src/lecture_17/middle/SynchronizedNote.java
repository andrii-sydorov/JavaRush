package lecture_17.middle;

import java.util.List;
import java.util.ArrayList;

/**
 * 1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы
 * обращения к листу notes блокировали мьютекс notes, не this 
 * 2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не
 * должны находиться в блоке synchronized
 * 
 * @author ASY
 *
 */

public class SynchronizedNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class Note {
		public static final List<String> notes = new ArrayList<>();

		public static void addNote(int index, String note) {
			System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
			synchronized (notes) {
				notes.add(index, note);
			}
			System.out.println("Уже добавлена заметка [" + note + "]");
		}

		public static void removeNote(int index) {
			System.out.println("Сейчас будет удалена заметка с позиции " + index);
			String note = null;
			synchronized (notes) {
				note = notes.remove(index);
			}
			System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
		}
	}

}
