package singleton.function;

import java.util.ArrayList;
import java.util.Iterator;

import unit.SingletonUnit;

public class Died {
	ArrayList<SingletonUnit> unitList=null;
	Iterator<SingletonUnit> iterator = null;
	public Died(ArrayList<SingletonUnit> unitList){ 
		iterator = unitList.iterator();
	}
	
	public void diedOne(String type){
		boolean result = false;
		while(iterator.hasNext()){
			SingletonUnit tempUnit = iterator.next();
			String tempType = tempUnit.getType();
			
			if(tempType.contains(type)){
				System.out.println(tempType + "이 죽었습니다.");
				iterator.remove();
				result=true;
				return;
			}
			
		}
		if (result==false)
			System.out.println("삭제 실패");
	}
	public void diedAll() {
		// TODO Auto-generated method stub
		while(iterator.hasNext()){
			SingletonUnit tempUnit = iterator.next();
			String tempType = tempUnit.getType();
			System.out.println(tempType + "이 죽었습니다.");
			iterator.remove();
		}
	}
	
}
