package lecture_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Программа вводит два имени файла. И копирует первый файл на место заданное
 * вторым именем.
 * 
 * @author SMD_ASY
 *
 */
public class WorkingWithStreams {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the source file name:");
		String sourceFileName = bf.readLine();
		System.out.println("Enter the destination file name:");
		String destinationFileName = bf.readLine();

		InputStream fileInputStream = getInputStream(sourceFileName);
		OutputStream fileOutputStream = getOutputStream(destinationFileName);

		int count = 0;
		while (fileInputStream.available() > 0) {
			int data = fileInputStream.read();
			fileOutputStream.write(data);
			count++;
		}

		System.out.println("Скопировано байт " + count);

		fileInputStream.close();
		fileOutputStream.close();
	}

	public static InputStream getInputStream(String fileName) throws IOException {
		return new FileInputStream(fileName);
	}

	public static OutputStream getOutputStream(String fileName) throws IOException {
		return new FileOutputStream(fileName);
	}
}
