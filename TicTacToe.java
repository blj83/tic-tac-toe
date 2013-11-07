
public class TicTacToe {

	public void moving(Player player1, Player player2, TicTacToeBoard board){
		
	}
	
	public static void main(String args[]){
	
		String[] arg = {"human", "human"};
		
		
		TicTacToeBoard board = new TicTacToeBoard();
		
		int turn = 1;
		
		Player player1 = null;
		Player player2 = null;
		
		if(arg.length != 2){
			System.out.println("Please enter two types of players.");
			System.exit(0);
		}if(arg[0].equalsIgnoreCase("human")){
			player1 = new HumanPlayer(1, board.getArray());
		}else if(arg[0].equalsIgnoreCase("naive")){
			player1 = new NaiveComputerPlayer(1, board.getArray());
		}else if(arg[0].equalsIgnoreCase("random")){
			player1 = new RandomComputerPlayer(1, board.getArray());
		}else if(arg[0].equalsIgnoreCase("cutthroat")){
			player1 = new CutThroatComputerPlayer(1, board.getArray());
		}else{
			System.out.println("Please enter a valid type of player (human, naive, random, or cutthroat).");
			System.exit(0);
		}if(arg[1].equalsIgnoreCase("human")){
			player2 = new HumanPlayer(2, board.getArray());
		}else if(arg[1].equalsIgnoreCase("naive")){
			player2 = new NaiveComputerPlayer(2, board.getArray());
		}else if(arg[1].equalsIgnoreCase("random")){
			player2 = new RandomComputerPlayer(2, board.getArray());
		}else if(arg[1].equalsIgnoreCase("cutthroat")){
			player2 = new CutThroatComputerPlayer(2, board.getArray());
		}else{
			System.out.println("Please enter a valid type of player (human, naive, random, or cutthroat).");
			System.exit(0);
		}
		
		System.out.println("Tic-tac-toe Game\n");
		
		board.drawBoard();
		
		
		while(!(board.checkTie())&&(board.checkWin()==0)){
			
			if(turn%2 != 0){
				player1.move();
			}else{
				player2.move();
			}
			board.drawBoard();
		}
		
		if(board.checkWin() == 1){
			System.out.println("Game Over! Player X wins!");
		}else if(board.checkWin() == 2){
			System.out.println("Game Over! Player O wins!");
		}else if(board.checkTie()){
			System.out.println("Game Over! Tie!");			
		}		
	}
}
