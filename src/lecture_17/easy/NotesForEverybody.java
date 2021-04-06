package lecture_17.easy;

import java.util.List;
import java.util.ArrayList;

/**
 * Класс Note будет использоваться нитями. Поэтому сделай так, чтобы лист notes
 * находился в общей памяти, Т.е не будет кэшироваться потоками в свою локальную
 * область памяти.
 * 
 * @author SMD_ASY
 *
 */

public class NotesForEverybody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class Note {

		public volatile List<String> notes = new ArrayList<>();

		public void addNote(int index, String note) {
			System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
			notes.add(index, note);
			System.out.println("Уже добавлена заметка [" + note + "]");
		}

		public void removeNote(int index) {
			System.out.println("Сейчас будет удалена заметка с позиции " + index);
			String note = notes.remove(index);
			System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
		}

	}

}
