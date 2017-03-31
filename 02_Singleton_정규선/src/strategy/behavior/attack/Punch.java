package strategy.behavior.attack;

public class Punch implements AttackBehavior {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("주먹으로 공격합니다.");
	}

	@Override
	public String getAttackType() {
		// TODO Auto-generated method stub
		return "Punch";
	}
	
	@Override
	public AttackBehavior getAttackType2(String type) {
		// TODO Auto-generated method stub
		return new Punch();
	}

}
