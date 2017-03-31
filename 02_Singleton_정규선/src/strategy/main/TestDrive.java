package strategy.main;

import strategy.behavior.attack.*;
import strategy.behavior.weapon.*;
import strategy.behavior.movement.*;
import strategy.unit.*;

public class TestDrive {
	
	public static void main(String[] args){		
		Unit citizen	= new Citizen();
		Unit knight		= new Knight();
		Unit mage		= new Mage();
		
		System.out.println("=======================================================");
		System.out.println("1. 유닛 생성 후 기본 정보 출력");
		System.out.println("=======================================================");
		
		System.out.println(citizen.toString());		
		System.out.println(knight.toString());
		System.out.println(mage.toString());
		
		System.out.println("=======================================================");
		System.out.println("2. 시민 +10/-10 이동 후 공격 명령");
		System.out.println("=======================================================");
		citizen.move(10, -10);
		citizen.fight();
		
		System.out.println("=======================================================");
		System.out.println("3. 기사 +30/+40 이동 후 공격 명령");
		System.out.println("=======================================================");
		knight.move(30, 40);
		knight.fight();
		
		System.out.println("=======================================================");
		System.out.println("4. 마법사 +30/+40 이동 후 공격 명령");
		System.out.println("=======================================================");
		mage.move(30, 40);
		mage.fight();
		
		System.out.println("=======================================================");
		System.out.println("5. 기사가 검을 잃어버려 맨손으로 돌아왔다");
		System.out.println("=======================================================");
		
		knight.setWeapon(new Fist());
		knight.setAttack(new Punch());
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. 시민을 기사의 위치로 이동명령");
		System.out.println("=======================================================");
		System.out.print("현재 시민의 위치: ");
		citizen.getLocation();
		System.out.print("현재 기사의 위치: ");
		knight.getLocation();
		
		System.out.println("---시민이 이동합니다---");
		citizen.setLocation(knight.getLocationX(), knight.getLocationY());
		
	
		System.out.println("=======================================================");
		System.out.println("7. 시민이 검을 주웠다. 검으로 공격명령");
		System.out.println("=======================================================");
		
		citizen.setWeapon(new Sword());
		citizen.setAttack(new SwingSword());
		citizen.fight();
		
		System.out.println("=======================================================");
		System.out.println("8. 기사 -200, -200 이동명령");
		System.out.println("=======================================================");
		knight.move(-200, -200);
		
		System.out.println("=======================================================");
		System.out.println("9. 세 유닛의 정보 출력");
		System.out.println("=======================================================");
		
		System.out.println(citizen.toString());		
		System.out.println(knight.toString());
		System.out.println(mage.toString());
		
		
	}
}
