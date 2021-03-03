package lecture_14.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * � ��� ���� �����������, �� ��� �������� �� � ������ ����. ����� �������� ��
 * ���������� �� �������� � ���, ��� ��� ����, � ������� ������ � �������. ���
 * ��� ���� ����� ������� ��� ��������� �������:
 * 
 * 	�����������, ��� ��������� ����� ������. 
 * 	��� ������ ������ ���� ������ ������ Solution. 
 * 	�������� ������ Cartoon, Thriller. 
 * 	�����������, ��� �� �������� ������ ������ SoapOpera �� ����� "soapOpera". 
 * 	���������� ��������� ������� SoapOpera �������: 
 * 		�������� � MovieFactory.getMovie ��������� ������� Cartoon ��� ����� "cartoon". 
 * 		�������� � MovieFactory.getMovie ��������� ������� Thriller ��� ����� "thriller". 
 * 
 * 	������� � ������� ��������� ������ (�����).
 * �����: ���� �������������, ��� ������ �������� ������ �� ����������� � �����
 * ��: "cartoon", "thriller", "soapOpera". 
 * 	������� ���������� movie ���� Movie � ��� ������ ��������� ������ (�����): 
 * 		�������� ������ ��������� MovieFactory.getMovie � ��������� ��� ���������� movie. 
 * 		������� �� ����� movie.getClass().getSimpleName().
 * 
 * @author ASY
 *
 */
public class Movies {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the names of movies:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String key = null;
		Movie movie = null;
		while (true) {
			key = bf.readLine();
			movie = MovieFactory.getMovie(key);
			if (movie == null) {
				break;
			}
		}
	}

	static class MovieFactory {
		public static Movie getMovie(String key) {
			Movie movie = null;
			if ("soapopera".equals(key)) {
				movie = new SoapOpera();
			} else if ("cartoon".equals(key)) {
				movie = new Cartoon();
			} else if ("thriller".equals(key)) {
				movie = new Thriller();
			}
			return movie;
		}
	}

	static abstract class Movie {

	}

	static class SoapOpera extends Movie {
	}

	static class Cartoon extends Movie {
	}

	static class Thriller extends Movie {
	}

}
