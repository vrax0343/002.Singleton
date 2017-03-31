package main;

import singleton.function.Print;
import singleton.unit.SingletonUnit;
import strategy.unit.Citizen;
import strategy.unit.Knight;
import strategy.unit.Mage;
import strategy.unit.Unit;

public class MainTest {
	
	public static void main(String[] args){		
		
		System.out.println("=======================================================");
		System.out.println("1. 유닛 종류별로 세명씩 생성한다. (기본 정보출력)");
		System.out.println("=======================================================");
		
		SingletonUnit singletonUnit = SingletonUnit.getInstance();
		
		Unit citizen	= new Citizen();
		Unit knight		= new Knight();
		Unit mage		= new Mage();
		
		singletonUnit.addUnit(citizen);
		singletonUnit.addUnit(knight);
		singletonUnit.addUnit(mage);
//		unit.addUnit("Citizen");
		
		System.out.println("=======================================================");
		System.out.println("2. 유닛 목록을 출력한다.");
		System.out.println("=======================================================");
		Print.printListByType(singletonUnit.getUnitList());
		
		System.out.println("=======================================================");
		System.out.println("3. 시민이 죽었다. (정보출력)");
		System.out.println("=======================================================");
		singletonUnit.unitDied("Citizen1");
		
		System.out.println("=======================================================");
		System.out.println("4. 유닛 목록을 출력한다.");
		System.out.println("=======================================================");
		singletonUnit.printAllUnit();
	
		System.out.println("=======================================================");
		System.out.println("5. 기사를 한명더 생성한다.");
		System.out.println("=======================================================");
		Unit knight2		= new Knight();
		singletonUnit.addUnit(knight2);
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("6. 유닛 목록을 출력한다.");
		System.out.println("=======================================================");
		singletonUnit.printAllUnit();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("7. 모든 유닛이 동시에 공격한다.");
		System.out.println("=======================================================");
		singletonUnit.fightAllUnit();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("8. 모든 유닛이 죽었다.");
		System.out.println("=======================================================");
		singletonUnit.unitDiedAll();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("9. 유닛 목록을 출력한다.");
		System.out.println("=======================================================");
		singletonUnit.printAllUnit();
		System.out.println();
		
	}
}
