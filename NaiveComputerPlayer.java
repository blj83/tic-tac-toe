
public class NaiveComputerPlayer extends ComputerPlayer{
	
	private int player;
	private char playerLetter;
	int[] spaces;
	
	public void move(){
		
		int j=0;
		
		for(int i=0; i<9; i++){
			if(spaces[i]==0){
				spaces[i]=player;
				j = i;
				break;
			}
		}
		
		promptInput();
		System.out.println(j + 1);
	}
	
	public NaiveComputerPlayer(int player, int[] spaces){
		super(player, spaces);
	}
}
