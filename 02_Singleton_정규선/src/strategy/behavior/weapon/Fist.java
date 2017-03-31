package strategy.behavior.weapon;

public class Fist implements WeaponBehavior {

	@Override
	public void useWeapon(){
		// TODO Auto-generated method stub
		System.out.println("주먹을 사용합니다.");
	}

	@Override
	public String getWeaponType() {
		// TODO Auto-generated method stub
		return "Fist";
	}

}
