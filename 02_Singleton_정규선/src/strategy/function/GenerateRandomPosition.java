package strategy.function;

public class GenerateRandomPosition {
	
	public static int generate() {
	    int value = -100 + (int) (Math.random() * ((100 - (-100)) + 1));
	    return value;
	}
	
}
