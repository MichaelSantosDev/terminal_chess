package boardgame;

public class Board {
	
	private final int ROW = 8;
	private final int COLUMN = 8;
	private Piece[][] pieces;
	
	
	public Board(){		
		pieces = new Piece[ROW][COLUMN];
	}
	

	public int getRow() {
		return ROW;
	}
	

	public int getColumn() {
		return COLUMN;
	}
	
	
	public Piece piece(int row, int column) {
		return pieces[row][column];		
	}
	
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];		
	}
	
	
	public void placePiece(Piece piece, Position position) {
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
		
	}

	
}
