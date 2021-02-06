package lection9;

import java.util.List;
import java.util.ArrayList;

/**
 * 1. ���� ���� �������: ������� �������, �������, �������, ��������, ����. 
 * 2. � ������� ������ ���� 2 ����: ���� (killed ArrayList) � ���� (ate ArrayList).
 * 3. ����������� ������� ������� (hood, grandmother, ...). 
 * 4. �������� ��������� �����, ��� ���� ���� � ����, ����� ���������� ������ ������
 * "������� �������".
 * 
 * PS: ������� ����� �� ��. �� ������ �����. ���� ����� ����. � ��� ����� �����.
 * 
 * @author SMD_ASY
 *
 */
public class TerribleTale {

	public static LittleRedRidingHood hood = new LittleRedRidingHood();
	public static Grandmother grandmother = new Grandmother();
	public static Patty patty = new Patty();
	public static Woodman woodman = new Woodman();
	public static Wolf wolf = new Wolf();

	public static void main(String[] agrs) {
		wolf.ate.add(grandmother);
		wolf.ate.add(hood);
		woodman.killed.add(wolf);
	}

	public static class LittleRedRidingHood extends StoryItem {
	}

	// �������
	public static class Grandmother extends StoryItem {
	}

	// �������
	public static class Patty extends StoryItem {
	}

	// ��������
	public static class Woodman extends StoryItem {
	}

	// ����
	public static class Wolf extends StoryItem {
	}

	public static abstract class StoryItem {
		public ArrayList<StoryItem> killed = new ArrayList<>();
		public ArrayList<StoryItem> ate = new ArrayList<>();
	}

}
