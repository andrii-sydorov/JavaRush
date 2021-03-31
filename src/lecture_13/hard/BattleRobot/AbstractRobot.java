package lecture_13.hard.BattleRobot;

public abstract class AbstractRobot implements Defensable, Attackable{
	private static int hitCount;
	
	public abstract String getName();
	
	public BodyPart attack() {
		BodyPart attackedBodyPart = null;
		hitCount = hitCount + 1;

		if (hitCount == 1) {
			attackedBodyPart = BodyPart.ARM;
		} else if (hitCount == 2) {
			attackedBodyPart = BodyPart.HEAD;
		} else if (hitCount == 3) {
			attackedBodyPart = BodyPart.LEG;
		} 
		else if(hitCount == 4) {
			attackedBodyPart = BodyPart.CHEST;
		}
		return attackedBodyPart;
	}
	
	public BodyPart defense() {
		BodyPart defendedBodyPart = null;

		if (hitCount == 1) {
			defendedBodyPart = BodyPart.ARM;
		} else if (hitCount == 2) {
			defendedBodyPart = BodyPart.HEAD;
		} else if (hitCount == 3) {
			defendedBodyPart = BodyPart.LEG;
		}
		 else if (hitCount == 4) {
			hitCount = 0;
			defendedBodyPart = BodyPart.CHEST;
		}
		return defendedBodyPart;
	}
/*
	public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }

        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.CHEST;
        } else {
            hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        }
        return defendedBodyPart;
    }
  /*  
    Амиго атаковал робота Сгибальщик-02, атакована рука, защищена рука
	Амиго атаковал робота Сгибальщик-02, атакована голова, защищена голова
	Сгибальщик-02 атаковал робота Амиго, атакована нога, защищена нога
	Амиго атаковал робота Сгибальщик-02, атакована грудь, защищена грудь
	Сгибальщик-02 атаковал робота Амиго, атакована рука, защищена рука
	Амиго атаковал робота Сгибальщик-02, атакована голова, защищена голова
	Сгибальщик-02 атаковал робота Амиго, атакована нога, защищена нога
	Амиго атаковал робота Сгибальщик-02, атакована грудь, защищена грудь
    */
	
}
