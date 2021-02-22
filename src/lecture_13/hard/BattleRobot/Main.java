package lecture_13.hard.BattleRobot;

/**
 * ��� ������ ��������� � ���, ��� ������ ���: ��� ����� ��������. ����� ������
 * ��� �������� ����� ����������� � ������ ����� ������:
 * 
 * ������ ����� AbstractRobot �����������, ������ ������ ����� � ������ �� Robot
 * � AbstractRobot. 
 * ������������ ����� Robot, �������� AbstractRobot. 
 * ������� ����� BodyPart ����� ������ ���� BodyPart.CHEST("�����"). 
 * ������ ����� ����� ���� � ���������� ����������� Attackable � Defensable (� ������
 * AbstractRobot).
 * 
 * @author ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		Robot amigo = new Robot("�����");
		Robot enemy = new Robot("����������-02");

		doMove(amigo, enemy);
		doMove(amigo, enemy);
		doMove(enemy, amigo);
		doMove(amigo, enemy);
		doMove(enemy, amigo);
		doMove(amigo, enemy);
		doMove(enemy, amigo);
		doMove(amigo, enemy);
	}

	public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
		BodyPart attacked = robotFirst.attack();
		BodyPart defenced = robotFirst.defense();
		System.out.println(String.format("%s �������� ������ %s, ��������� %s, �������� %s", robotFirst.getName(),
				robotSecond.getName(), attacked, defenced));
	}

}
