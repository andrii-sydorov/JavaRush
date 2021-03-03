package lecture_14.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * У нас есть кинофабрика, но она работает не в полную силу. Давай расширим ее
 * функционал по аналогии с тем, что уже есть, и добавим чтение с консоли. Вот
 * что тебе нужно сделать для успешного решения:
 * 
 * 	Разобраться, что программа умеет делать. 
 * 	Все классы должны быть внутри класса Solution. 
 * 	Добавить классы Cartoon, Thriller. 
 * 	Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera". 
 * 	Аналогично получению объекта SoapOpera сделать: 
 * 		добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon". 
 * 		добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller". 
 * 
 * 	Считать с консоли несколько ключей (строк).
 * Важно: ввод заканчивается, как только вводится строка не совпадающая с одной
 * из: "cartoon", "thriller", "soapOpera". 
 * 	Создать переменную movie типа Movie и для каждой введенной строки (ключа): 
 * 		получить объект используя MovieFactory.getMovie и присвоить его переменной movie. 
 * 		вывести на экран movie.getClass().getSimpleName().
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
