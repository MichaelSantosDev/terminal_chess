package app;


import boardgame.Position;
import chess.ChessMatch;

public class Start {

	public static void main(String[] args) {
		
		//Testing position class
		Position pos = new Position(2,3);		
		System.out.println(pos.toString());
		
		ChessMatch chessMatch = new ChessMatch();
		
		UserInterface.printBoard(chessMatch.getPieces());
		
		

	}

}
