package lecture_13.hard.BattleRobot;

/**
 * Для начала разберись в том, что делает код: это будет непросто. Затем измени
 * код согласно новой архитектуре и добавь новую логику:
 * 
 * Сделай класс AbstractRobot абстрактным, вынеси логику атаки и защиты из Robot
 * в AbstractRobot. 
 * Отредактируй класс Robot, учитывая AbstractRobot. 
 * Расширь класс BodyPart новой частью тела BodyPart.CHEST("грудь"). 
 * Добавь новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе
 * AbstractRobot).
 * 
 * @author ASY
 *
 */
public class Main {

	public static void main(String[] args) {
		Robot amigo = new Robot("Амиго");
		Robot enemy = new Robot("Сгибальщик-02");

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
		System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s", robotFirst.getName(),
				robotSecond.getName(), attacked, defenced));
	}

}
