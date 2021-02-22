package lecture_13.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * � ���� ������ ���� �����:
 * 
 * 1) �������� � ������� ��� �����. 
 * 2) ��������� ������ � �������, ���� ������������ �� ������ ������ "exit". 
 * 3) ������� ��������� ��� ��������� ������ � ����, ������ ������� � � ����� ������.
 * 
 * @author SMD_ASY
 *
 */
public class WrtiteToFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the path for file:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fileName = br.readLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String data = br.readLine();
		while (!data.equals("exit")) {
			bw.write(data + "\n");
			data = br.readLine();
		}
		bw.write(data);
		bw.close();
		br.close();
	}

}
