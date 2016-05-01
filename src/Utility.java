import java.util.Random;

public class Utility {
	private static int a = (int) (System.currentTimeMillis() / 1000L);
	private static Random generator = new Random();
	public static int randomGenerator() {
			generator.setSeed(a);
			a+=3;
	        return ((generator.nextInt()%100)+100)%10;
	}
}