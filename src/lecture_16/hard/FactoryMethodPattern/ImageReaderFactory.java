package lecture_16.hard.FactoryMethodPattern;

import lecture_16.hard.FactoryMethodPattern.common.*;

public class ImageReaderFactory {
	static ImageReader getImageReader(ImageTypes i) {
		ImageReader r = null;
		if(i == null) {
			throw new IllegalArgumentException("не правильный код картинки");
		}
		switch (i) {
		case JPG:
			r = new JpgReader();
			break;
		case PNG:
			r = new PngReader();
			break;
		case BMP:
			r = new BmpReader();
			break;
		default:
			throw new IllegalArgumentException();
		}
		return r;
	}
}
