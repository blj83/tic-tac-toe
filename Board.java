
public interface Board {
	
	int[] spaces = new int[9];
	
	public int getSpaces(int i);
	
	public void setSpaces(int i, int player);
	
	public String drawBoard();
	
	public int checkWin();
	
	public boolean checkTie();
	
}
