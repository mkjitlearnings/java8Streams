package p1;

public class NewWay {

	public static void main(String[] args) {
		Game game;
		game = (int count)->
		{
			System.out.println(count*0.75);
			System.out.println(count*0.25);
			
		};
		
		new NewWay().school(game);
		
	}
	
	public void school(Game game)
	{
		game.play(12);
		
	}
}
