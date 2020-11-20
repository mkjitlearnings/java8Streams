package p1;

interface Game 
{
	public void play(int count);
}

class Football implements Game
{
	@Override
	public void play(int count) {
		// TODO Auto-generated method stub
		
	}
}


public class LambdaApp1 {
	
	public static void main(String[] args) {
		
		Game football = new Game() {
			
			@Override
			public void play(int count) {
				// TODO Auto-generated method stub
				
			}
		};
		football.play(2);
		
		Game swimming = (int count)->System.out.println(" its a water game in between "+count+" players");
		swimming.play(5);
	}
	
}











