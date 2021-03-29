package lecture_16.hard.FactoryMethodPattern;

import lecture_16.hard.FactoryMethodPattern.common.*;

/**
 * 1. ����������� ��������, ����� ������ � ���� ����. 
 * 2. � ��������� ������ � ������ common ������ ������ JpgReader, PngReader, BmpReader, �������
 * ��������� ��������� ImageReader. 
 * 3. � ��������� ����� � �������� ������ ������ ����� ImageReaderFactory � ����� �������. 
 * 	3.1. �������, ��� �� ������ ����������.
 *  3.2. �������, ����� ������������ ������ ���� � ����� ������. 
 * 4. ���� ����� ������: 
 * 4.1. ��� ������� �������� �� ImageTypes ���������� ��������������� Reader, ��������, ��� ImageTypes.JPG - JpgReader;
 * 4.2. ���� ������� ������������ ��������, �� ����������� ���������� IllegalArgumentException("����������� ��� ��������").
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
