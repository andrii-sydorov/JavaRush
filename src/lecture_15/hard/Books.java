package lecture_15.hard;

import java.util.List;
import java.util.LinkedList;

/**
 * ����� ������� ���������, ������� ����� ���������� ���� �����, ��� ������,
 * ������� �� �������. ��� �����:
 * 
 *  ������ public static ����� MarkTwainBook, ������� ����������� �� Book. ���
 * ������ � [Mark Twain]. �������� ������������ � �������� ����� (title).
 *  � ������ MarkTwainBook �������� ��� ����������� ������.
 *  ��� ������ getBook ������ ��� ������������� �������� �� ����� ����������.
 *  ������ �� �������� AgathaChristieBook. ��� ������ � [Agatha Christie].
 *  � ������ Book �������� ���� ������ getOutputByBookType() ���, ����� �� ���������:
 *		agathaChristieOutput � ��� ���� ����� ������;
 * 		markTwainOutput � ��� ���� ����� �����.
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
