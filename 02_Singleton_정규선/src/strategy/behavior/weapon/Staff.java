package strategy.behavior.weapon;

public class Staff implements WeaponBehavior {

	@Override
	public void useWeapon(){
		// TODO Auto-generated method stub
		System.out.println("스태프를 사용합니다.");
	}

	@Override
	public String getWeaponType() {
		// TODO Auto-generated method stub
		return "Staff";
	}

}
