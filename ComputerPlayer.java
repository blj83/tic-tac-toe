
public abstract class ComputerPlayer extends Player{
	
	private int player;
	private char playerLetter;
	int[] spaces;
	
	public ComputerPlayer(int player, int[] spaces){
		super(player, spaces);
	}
}
