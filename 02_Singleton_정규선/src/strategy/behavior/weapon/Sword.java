package strategy.behavior.weapon;

public class Sword implements WeaponBehavior {

	@Override
	public void useWeapon(){
		// TODO Auto-generated method stub
		System.out.println("검을 사용합니다.");
	}

	@Override
	public String getWeaponType() {
		// TODO Auto-generated method stub
		return "Sword";
	}

}
