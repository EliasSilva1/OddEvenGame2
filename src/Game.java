import java.util.Random;

public class Game {
	
	public static int  GetRandom()
	{
		int game = new Random().nextInt(6)+1;
		return game;
	}

}
