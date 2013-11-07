
public class Player {
	
	private int player;
	private char playerLetter;
	int[] spaces;
	
	public void setSpaces(int[] tempBoard) {
		for (int i = 0 ; i < tempBoard.length; i++){
			this.spaces[i] = tempBoard[i];
			System.out.print(spaces[i] + " ");
		}
		System.out.println();
	}
	
	public int[] getSpaces(){
		return spaces;
	}
	

	public void setLetter(){
		if (this.player == 1){
			this.playerLetter = 'X';
		}
		else if (this.player == 2){
			this.playerLetter = 'O';
		}
	}
	
	public char getLetter(){
		return this.playerLetter;
	}
	
	public void setPlayer(int tempPlayer){
		this.player = tempPlayer;
	}
	
	public int getPlayer(){
		return this.player;
	}


	
	public void promptInput(){
		System.out.print("Player " + this.getLetter() + " enter an open spot to mark: ");
	}
	
	public void move(){
		
	}
	
	public Player(int player, int[] spaces){
		
		this.player = player;
		
		this.spaces = spaces;
	}

}
