package lecture_15.middle.ReadFromFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ��� ������� ���� ������:
 * 
 * ������������� ���������� Statics.FILE_NAME ������ ����� � ����� � �������,
 * ������� �������� ��������� �����. � ����������� ����� ������ �� ����� �
 * ������ Statics.FILE_NAME ��� ������ � ������ �� �� ����������� � List lines.
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static List<String> list = new ArrayList<>();

	static {
		BufferedReader bf = null;
		String line = null;
		try {
			bf = new BufferedReader(new FileReader(Statics.FILE_NAME));
			// second possible variant
			// bf = new BufferedReader(new InputStreamReader(new
			// FileInputStream(Statics.FILE_NAME)));
			line = bf.readLine();
			while (line != null) {
				list.add(line);
				line = bf.readLine();
			}
			bf.close();
		} catch (IOException ioe) {
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(list);
	}

}
