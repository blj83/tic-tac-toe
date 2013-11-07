
public class TicTacToeBoard implements Board{

	int[] spaces = new int[9];
	
	public int getSpaces(int i){
		return spaces[i];
	}
	
	public void setSpaces(int i, int player){
		if(spaces[i]==0){
			spaces[i]=player;
		}
	}
	
	public int[] getArray(){
		return spaces;
	}
	
	public String drawBoard() {
		String board = "\n";
		
		for(int i=0; i<3; i++){
			if(spaces[i]==1){
				board += "X";
			}else if(spaces[i]==2){
				board += "O";
			}else{
				board += " ";
			}if((i==0)||(i==1)){
				board += "|";
			}else{
				board +="\n-----\n";
			}
		}
		for(int i=3; i<6; i++){
			if(spaces[i]==1){
				board += "X";
			}else if(spaces[i]==2){
				board += "O";
			}else{
				board += " ";
			}if((i==3)||(i==4)){
				board += "|";
			}else{
				board +="\n-----\n";
			}
		}
		for(int i=6; i<9; i++){
			if(spaces[i]==1){
				board += "X";
			}else if(spaces[i]==2){
				board += "O";
			}else{
				board += " ";
			}if((i==6)||(i==7)){
				board += "|";
			}else{
				board +="\n\n";
			}
		}
		return board;
	}
		
	
	public int checkWin() {
		if((spaces[0]==1)&&(spaces[1]==1)&&(spaces[2]==1)){ //rows for X
			return 1;
		}else if((spaces[3]==1)&&(spaces[4]==1)&&(spaces[5]==1)){
			return 1;
		}else if((spaces[6]==1)&&(spaces[7]==1)&&(spaces[8]==1)){
			return 1;
		}else if((spaces[0]==1)&&(spaces[3]==1)&&(spaces[6]==1)){ //columns for X
			return 1;
		}else if((spaces[1]==1)&&(spaces[4]==1)&&(spaces[7]==1)){
			return 1;
		}else if((spaces[2]==1)&&(spaces[5]==1)&&(spaces[8]==1)){
			return 1;
		}else if((spaces[0]==1)&&(spaces[4]==1)&&(spaces[8]==1)){ //diagonals for X
			return 1;
		}else if((spaces[2]==1)&&(spaces[4]==1)&&(spaces[6]==1)){
			return 1;
		}else if((spaces[0]==2)&&(spaces[1]==2)&&(spaces[2]==2)){ //rows for O
			return 2;
		}else if((spaces[3]==2)&&(spaces[4]==2)&&(spaces[5]==2)){
			return 2;
		}else if((spaces[6]==2)&&(spaces[7]==2)&&(spaces[8]==2)){
			return 2;
		}else if((spaces[0]==2)&&(spaces[3]==2)&&(spaces[6]==2)){ //columns for O
			return 2;
		}else if((spaces[1]==2)&&(spaces[4]==2)&&(spaces[7]==2)){
			return 2;
		}else if((spaces[2]==2)&&(spaces[5]==2)&&(spaces[8]==2)){
			return 2;
		}else if((spaces[0]==2)&&(spaces[4]==2)&&(spaces[8]==2)){ //diagonals for O
			return 2;
		}else if((spaces[2]==2)&&(spaces[4]==2)&&(spaces[6]==2)){
			return 2;
		}else{
			return 0;
		}
	}

	
	public boolean checkTie() {
		for(int i=0; i<8; i++){
			if(spaces[i]==0){
				return false;
			}
		}if(checkWin()==0){
			return true;
		}else{
			return false;
		}
	}

	public TicTacToeBoard(){
		
		for(int i=0; i<9; i++){
			spaces[i] = 0;
		}
		
	}
}
