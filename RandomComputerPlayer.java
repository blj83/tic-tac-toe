import java.util.Random;

public class RandomComputerPlayer extends ComputerPlayer{

	private int player;
	private char playerLetter;
	int[] spaces;
	
	Random random = new Random();
	
	
	public void move(){
		int i = random.nextInt(9);
		
		while(spaces[i] != 0){
			i = random.nextInt(9);
		}
		
		spaces[i] = player;
		
		promptInput();
		System.out.println(i + 1);
	}
	
	public RandomComputerPlayer(int player, int[] spaces){
		super(player, spaces);
	}
}
