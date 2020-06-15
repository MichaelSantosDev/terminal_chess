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
		if(!validPosition(row, column)) {
			throw new BoardException("This positon is not valid");
		}		
		return pieces[row][column];		
	}
	
	
	public Piece piece(Position position) {		
		if(!validPosition(position)) {
			throw new BoardException("This positon is not valid");
		}		
		return pieces[position.getRow()][position.getColumn()];		
	}
	
	
	public void placePiece(Piece piece, Position position) {
		if(isThereAPiece(position)) {
			throw new BoardException("Already has a piece in position " + position);
		}		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;		
	}
	
	
public boolean validPosition(int row, int column) {	
	return row >= 0 && row < ROW && column >= 0 && column < COLUMN;		
	}

	
	public boolean validPosition(Position position) {		
		return validPosition(position.getRow(), position.getColumn());		
	}
	
	
	public boolean isThereAPiece(Position position) {
		if(!validPosition(position)) {
			throw new BoardException("This position is not valid.");
		}		
		return piece(position) != null;	
	}
	
}
