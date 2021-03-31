package lecture_15.hard;

import java.util.List;
import java.util.LinkedList;

/**
 * Давай напишем программу, которая будет определять жанр книги, или автора,
 * который ее написал. Для этого:
 * 
 *  Создай public static класс MarkTwainBook, который наследуется от Book. Имя
 * автора — [Mark Twain]. Параметр конструктора — название книги (title).
 *  В классе MarkTwainBook реализуй все абстрактные методы.
 *  Для метода getBook измени тип возвращаемого значения на более подходящий.
 *  Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
 *  В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
 *		agathaChristieOutput — для книг Агаты Кристи;
 * 		markTwainOutput — для книг Марка Твена.
 * 
 * @author SMD_ASY
 *
 */
public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new LinkedList<Book>();
		books.add(new MarkTwainBook("Tom Sawyer"));
		books.add(new AgathaChristieBook("Hercule Poirot"));
		System.out.println(books);
	}

	public static class MarkTwainBook extends Book {
		private String title;

		public MarkTwainBook(String title) {
			super("Mark Twain");
			this.title = title;
		}

		public MarkTwainBook getBook() {
			return this;
		}

		public String getTitle() {
			return this.title;
		}
	}

	public static class AgathaChristieBook extends Book {
		private String title;

		public AgathaChristieBook(String title) {
			super("Agatha Christie");
			this.title = title;
		}

		public AgathaChristieBook getBook() {
			return this;
		}

		public String getTitle() {
			return this.title;
		}
	}

	abstract static class Book {
		private String author;

		public Book(String author) {
			this.author = author;
		}

		public abstract Book getBook();

		public abstract String getTitle();

		private String getOutputByBookType() {

			String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
			String markTwainOutput = getBook().getTitle() + " was written by " + author;

			String output = "output";
			if (getBook() instanceof AgathaChristieBook) {
				output = agathaChristieOutput;
			} else {
				output = markTwainOutput;
			}

			return output;
		}

		public String toString() {
			return getOutputByBookType();
		}
	}

}
