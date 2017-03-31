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
		System.out.println("1. ���� �������� ���� �����Ѵ�. (�⺻ �������)");
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
		System.out.println("2. ���� ����� ����Ѵ�.");
		System.out.println("=======================================================");
		Print.printListByType(singletonUnit.getUnitList());
		
		System.out.println("=======================================================");
		System.out.println("3. �ù��� �׾���. (�������)");
		System.out.println("=======================================================");
		singletonUnit.unitDied("Citizen1");
		
		System.out.println("=======================================================");
		System.out.println("4. ���� ����� ����Ѵ�.");
		System.out.println("=======================================================");
		singletonUnit.printAllUnit();
	
		System.out.println("=======================================================");
		System.out.println("5. ��縦 �Ѹ�� �����Ѵ�.");
		System.out.println("=======================================================");
		Unit knight2		= new Knight();
		singletonUnit.addUnit(knight2);
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("6. ���� ����� ����Ѵ�.");
		System.out.println("=======================================================");
		singletonUnit.printAllUnit();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("7. ��� ������ ���ÿ� �����Ѵ�.");
		System.out.println("=======================================================");
		singletonUnit.fightAllUnit();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("8. ��� ������ �׾���.");
		System.out.println("=======================================================");
		singletonUnit.unitDiedAll();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("9. ���� ����� ����Ѵ�.");
		System.out.println("=======================================================");
		singletonUnit.printAllUnit();
		System.out.println();
		
	}
}
