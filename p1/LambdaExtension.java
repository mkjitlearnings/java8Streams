package p1;

public class LambdaExtension {

	public static void main(String[] args) {
		
		LambdaExtension obj = new LambdaExtension();
		
		obj.school(new Game() {
			
			@Override
			public void play(int count) {
				System.out.println(" Main Players "+(count*0.75));
				System.out.println(" Extra Players "+(count*0.25));
			}
		});
		
		
	}
	
	public void school(Game game)
	{
		System.out.println("Enter Number of Player: ");
		game.play(new java.util.Scanner(System.in).nextInt());
		
	}
}
