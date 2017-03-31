package strategy.behavior.attack;

public interface AttackBehavior {
	public void attack();
	public String getAttackType();
	public AttackBehavior getAttackType2(String type);
}
