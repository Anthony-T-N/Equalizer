import java.util.Random;

public class Equalizer 
{
	public static void main(String args[])
	{
		Random randomGenerator = new Random();
		boolean dialswitch = true;
		int tries = 0;
		while True
		{
			int key1 = randomGenerator.nextInt(100);
			int key2 = randomGenerator.nextInt(100);
			int key3 = randomGenerator.nextInt(100);
			System.out.println(key1+" "+key2+" "+key3);
			tries++;
		}
  	}	
  
}
