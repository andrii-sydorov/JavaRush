package lecture_16.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;

//D:\\Work\\Java\\project's\\JavaRush\\src\\lecture_16\\hard\\firstFileName
//D:\\Work\\Java\\project's\\JavaRush\\src\\lecture_16\\hard\\secondFileName

/**
 * Последовательный вывод файлов
 * 
 * 1. Разберись, что делает программа. 
 * 2. В статическом блоке считай 2 имени файла firstFileName и secondFileName. 
 * 3. Внутри класса Solution создай нить public static ReadFileThread, 
 * которая реализует интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
 *  3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое. 
 *  3.2. Метод getFileContent должен возвращать содержимое файла. 
 *  3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
 * 4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы
 * обеспечить последовательный вывод файлов.
 *  4.1. Для этого добавь вызов соответствующего метода.
 * 
 * Ожидаемый вывод: [все тело первого файла] [все тело второго файла]
 * 
 * @author ASY
 *
 */

public class ReadDataFromFileWithMultiThreadBufRead {

	public static String firstFileName;
	public static String secondFileName;

	static {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file's name and path: ");
			firstFileName = bf.readLine();
			System.out.println("Enter the file's name and path: ");
			secondFileName = bf.readLine();
			bf.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		systemOutPrintln(firstFileName);
		systemOutPrintln(secondFileName);
	}

	public static void systemOutPrintln(String fileName) throws InterruptedException {
		ReadFileInterface f = new ReadFileThread();
		f.setFileName(fileName);
		f.start();
		f.join();
		System.out.println(f.getFileContent());
	}

	public interface ReadFileInterface {

		void setFileName(String fullFileName);

		String getFileContent();

		void join() throws InterruptedException;

		void start();

	}

	public static class ReadFileThread extends Thread implements ReadFileInterface {

		private FileReader f;
		private StringBuilder sb = new StringBuilder();

		@Override
		public void setFileName(String fullFileName) {
			try {
				f = new FileReader(fullFileName);
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		@Override
		public String getFileContent() {
			return sb.toString();
		}

		@Override
		public void run() {
			BufferedReader bf = new BufferedReader(f);
			String s = null;
			try {
				while ((s = bf.readLine()) != null) {
					sb.append(s).append(" ");
				}
				bf.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
