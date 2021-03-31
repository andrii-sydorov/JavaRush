package lecture_16.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

//D:\\Work\\Java\\project's\\JavaRush\\src\\lecture_16\\hard\\firstFileName
//D:\\Work\\Java\\project's\\JavaRush\\src\\lecture_16\\hard\\secondFileName

public class ReadDataFromFileWithMultiThreadScan {

	public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static String firstFileName;
	public static String secondFileName;

	static {
		try {
			//System.out.println("Enter the file's name and path: ");
			firstFileName = bf.readLine();
			//System.out.println("Enter the file's name and path: ");
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
		private Scanner sc;

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
			return sb.toString().trim();
		}

		@Override
		public void run() {
			sc = new Scanner(f);
			while (sc.hasNext()) {
				sb.append(sc.nextLine()).append(" ");
			}
			sc.close();
		}

	}

}
