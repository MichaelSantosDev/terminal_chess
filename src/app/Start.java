package app;


import boardgame.Position;
import chess.ChessMatch;

public class Start {

	public static void main(String[] args) {		
		
		ChessMatch chessMatch = new ChessMatch();
		
		UserInterface.printBoard(chessMatch.getPieces());
		
		

	}

}
