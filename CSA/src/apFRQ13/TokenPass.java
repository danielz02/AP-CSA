package apFRQ13;

public class TokenPass {
	private int[] board;
	private int currentPlayer;
	
	public TokenPass(int playerCount) {
		this.board = new int[playerCount];
		for(int i = 0; i < board.length; i++) 
			board[i] = (int)(Math.random() * 10) + 1;
		this.currentPlayer = (int)(Math.random() * playerCount); 
	}
	
	public void dirtributeCurrentPlayerTokens() {
		int tokenNum = board[currentPlayer];
		board[currentPlayer] = 0;
		
	}
}
