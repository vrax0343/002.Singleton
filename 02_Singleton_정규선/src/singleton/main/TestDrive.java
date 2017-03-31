package singleton.main;

import singleton.unit.SingletonUnit;

public class TestDrive {


		
		public static void main(String[] args){		
			
			System.out.println("=======================================================");
			System.out.println("1. 유닛 종류별로 세명씩 생성한다. (기본 정보출력)");
			System.out.println("=======================================================");
			
			SingletonUnit unit = SingletonUnit.getInstance();
//			unit.addUnit("Citizen");
//			unit.addUnit("Knight");
//			unit.addUnit("Mage");
//			unit.addUnit("Citizen");
			System.out.println();
			
			System.out.println("=======================================================");
			System.out.println("2. 유닛 목록을 출력한다.");
			System.out.println("=======================================================");
			unit.printAllUnit();
			System.out.println();
			
			System.out.println("=======================================================");
			System.out.println("3. 시민이 죽었다. (정보출력)");
			System.out.println("=======================================================");
			unit.unitDied("Citizen1");
			System.out.println();
//			
//			System.out.println("=======================================================");
//			System.out.println("4. 유닛 목록을 출력한다.");
//			System.out.println("=======================================================");
//			unit.printAllUnit();
//			System.out.println();
	//	
//			System.out.println("=======================================================");
//			System.out.println("5. 기사를 한명더 생성한다.");
//			System.out.println("=======================================================");
//			unit.addUnit("Knight");
//			System.out.println();
	//
//			System.out.println("=======================================================");
//			System.out.println("6. 유닛 목록을 출력한다.");
//			System.out.println("=======================================================");
//			unit.printAllUnit();
//			System.out.println();
	//
//			System.out.println("=======================================================");
//			System.out.println("7. 모든 유닛이 동시에 공격한다.");
//			System.out.println("=======================================================");
//			unit.fightAllUnit();
//			System.out.println();
	//
//			System.out.println("=======================================================");
//			System.out.println("8. 모든 유닛이 죽었다.");
//			System.out.println("=======================================================");
//			unit.unitDiedAll();
//			System.out.println();
	//
//			System.out.println("=======================================================");
//			System.out.println("9. 유닛 목록을 출력한다.");
//			System.out.println("=======================================================");
//			unit.printAllUnit();
//			System.out.println();
			
		}
	}

