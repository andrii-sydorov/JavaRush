package lecture_16.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;

//D:\\Work\\Java\\project's\\JavaRush\\src\\lecture_16\\hard\\firstFileName
//D:\\Work\\Java\\project's\\JavaRush\\src\\lecture_16\\hard\\secondFileName

/**
 * ���������������� ����� ������
 * 
 * 1. ���������, ��� ������ ���������. 
 * 2. � ����������� ����� ������ 2 ����� ����� firstFileName � secondFileName. 
 * 3. ������ ������ Solution ������ ���� public static ReadFileThread, 
 * ������� ��������� ��������� ReadFileInterface (�������, ��� ������ �������� - Thread ��� Runnable).
 *  3.1. ����� setFileName ������ ������������� ��� �����, �� �������� ����� �������� ����������. 
 *  3.2. ����� getFileContent ������ ���������� ���������� �����. 
 *  3.3. � ������ run ������ ���������� �����, ������ �����. ������� �������� ������ �����.
 * 4. �������, � ����� ����� ����� ��������� ��������� ������ ����, �����
 * ���������� ���������������� ����� ������.
 *  4.1. ��� ����� ������ ����� ���������������� ������.
 * 
 * ��������� �����: [��� ���� ������� �����] [��� ���� ������� �����]
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
