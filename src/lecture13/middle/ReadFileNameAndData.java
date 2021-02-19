package lecture13.middle;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * В этой задаче тебе нужно:
 * 
 * Считать с консоли имя файла. Вывести в консоли (на экран) содержимое файла.
 * Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 * 
 * @author SMD_ASY
 *
 */
public class ReadFileNameAndData {
	public static void main(String[] args) throws IOException {
		ReadLineWithBufferedReader();
		ReadLineWithScanner();
	}

	public static void ReadLineWithBufferedReader() throws FileNotFoundException, IOException {
		System.out.println("Enter your's file name:");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String ans = "";
		int data = bf.read();
		while (data != -1) {
			ans += (char) data;
			data = bf.read();
		}
		System.out.println(ans);
		bf.close();
		sc.close();
	}

	public static void ReadLineWithScanner() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String fileName = bf.readLine();
		Scanner sc = new Scanner(new FileInputStream(fileName));
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine()).append("\n");
		}
		System.out.print(sb.toString());
		bf.close();
		sc.close();
	}
}
