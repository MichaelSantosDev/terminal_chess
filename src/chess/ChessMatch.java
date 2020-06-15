package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board();
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){		
		
		ChessPiece[][] pieces = new ChessPiece[board.getRow()][board.getColumn()];
		
		for (int i = 0; i < board.getRow(); i++) {
			
			for (int j = 0; j < board.getColumn(); j++) {
				
				pieces[i][j] = (ChessPiece) board.piece(i, j);
				
			}
			
		}
		
		return pieces;		
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.WHITE), new Position(0,4));
		board.placePiece(new King(board, Color.BLACK), new Position(7,4));
	}

}



