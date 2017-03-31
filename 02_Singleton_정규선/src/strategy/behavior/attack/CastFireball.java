package strategy.behavior.attack;

public class CastFireball implements AttackBehavior {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("파이어 볼로 공격합니다.");
	}

	@Override
	public String getAttackType() {
		// TODO Auto-generated method stub
		return "CastFireball";
	}
	
	@Override
	public AttackBehavior getAttackType2(String type) {
		// TODO Auto-generated method stub
		return new CastFireball();
	}

}
