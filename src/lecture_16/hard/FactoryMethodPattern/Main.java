package lecture_16.hard.FactoryMethodPattern;

import lecture_16.hard.FactoryMethodPattern.common.*;

/**
 * 1. Внимательно посмотри, какие классы у тебя есть. 
 * 2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader, которые
 * реализуют интерфейс ImageReader. 
 * 3. В отдельном файле в основном пакете создай класс ImageReaderFactory с одним методом. 
 * 	3.1. Подумай, как он должен называться.
 *  3.2. Подумай, какие модификаторы должны быть у этого метода. 
 * 4. Этот метод должен: 
 * 4.1. Для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
 * 4.2. Если передан неправильный параметр, то выбрасывать исключение IllegalArgumentException("Неизвестный тип картинки").
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageReader imageReader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
		System.out.println(imageReader.getClass().getSimpleName());
		imageReader = ImageReaderFactory.getImageReader(null);
		System.out.println(imageReader.getClass().getSimpleName());
	}

}
