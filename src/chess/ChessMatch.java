package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board = new Board();
	
	public ChessMatch() {}
	
	public ChessPiece[][] getPieces(){
		
		System.out.println(board.getRow());
		System.out.println(board.getColumn());
		
		ChessPiece[][] pieces = new ChessPiece[board.getRow()][board.getColumn()];
		
		for (int i = 0; i < board.getRow(); i++) {
			
			for (int j = 0; j < board.getColumn(); j++) {
				
				pieces[i][j] = (ChessPiece) board.piece(i, j);
				
			}
			
		}
		
		return pieces;
		
	}

}



